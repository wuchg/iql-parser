package org.example.parser;

import java.util.*;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.function.*;

public class CustomIqlListener extends IqlBaseListener {

    private final Map<String, Function> registeredFunctions = new HashMap<>();
    private final Map<String, Object> functionResult = new HashMap<>();

    private final StringBuilder query = new StringBuilder();
    private final List<Map<String,String>> sort = new ArrayList<>();
    private final StringBuilder aggregation = new StringBuilder();

    private final Map<String, String> operatorMap = new HashMap<>();
    private final Stack<ParserRuleContext> contextStack = new Stack<>();

    private final Set<String> fields = new HashSet<>();


    public CustomIqlListener() {
        registerBuiltInFunctions();

        operatorMap.put("=", "{\"term\": { \"#FIELD_KEY#\" :\"#FIELD_VALUE#\" }}");
        operatorMap.put("!=", "{\"bool\": {\"must_not\": { \"term\": {\"#FIELD_KEY#\" :\"#FIELD_VALUE#\"}}}}");
        operatorMap.put("~", "{\"match\": {\"#FIELD_KEY#\" :\"#FIELD_VALUE#\"}}");
        operatorMap.put("!~", "{\"bool\": {\"must_not\": { \"match\": {\"#FIELD_KEY#\" :\"#FIELD_VALUE#\"}}}");
        operatorMap.put("<", "{\"range\": { \"#FIELD_KEY#\": { \"lt\" : \"#FIELD_VALUE#\" }}}");
        operatorMap.put("<=", "{\"range\": { \"#FIELD_KEY#\": { \"lte\" : \"#FIELD_VALUE#\" }}}");
        operatorMap.put(">", "{\"range\": { \"#FIELD_KEY#\": { \"gt\" : \"#FIELD_VALUE#\" }}}");
        operatorMap.put(">=", "{\"range\": { \"#FIELD_KEY#\": { \"gte\" : \"#FIELD_VALUE#\" }}}");
        operatorMap.put("IN", "{\"terms\": { \"#FIELD_KEY#\" : [ #FIELD_VALUE# ] }}");
        // spaces are removed
        operatorMap.put("NOTIN", "{\"bool\": {\"must_not\": { \"terms\": { \"#FIELD_KEY#\" : [ #FIELD_VALUE# ] }}}}");
        // Add more operators as needed
    }

    // 注册内置函数
    private void registerBuiltInFunctions() {
        registeredFunctions.put("sum", new SumFunction());
    }

    @Override
    public void enterQuery(IqlParser.QueryContext ctx) {
        query.append("{ \"query\": ");
    }

    @Override
    public void exitQuery(IqlParser.QueryContext ctx) {
        // for root query
        query.append("}");
    }

    @Override
    public void enterExpr(IqlParser.ExprContext ctx) {
        contextStack.push(ctx);
        // Handle when the expression is inside parentheses
        if (ctx.OPEN_PAR() != null) {
            IqlParser.ExprContext innerExpr = ctx.expr().getFirst();
            // any problems if added empty string?
            query.append(appendBooleanQuery(innerExpr));
        }

        if (contextStack.size() == 1) {
            query.append(appendBooleanQuery(ctx));
        }

    }

    @Override
    public void exitExpr(IqlParser.ExprContext ctx) {
        contextStack.pop();
//        IqlParser.ExprContext x = (IqlParser.ExprContext) contextStack.pop();
//        System.out.println("Exit Expr: " + x.getText());
        if (ctx.K_AND() != null || ctx.K_OR() != null || (ctx.K_NOT() != null && !ctx.K_NOT().isEmpty())) {
            if (isNotLast(ctx)) {
                query.append(",");
            } else {
                query.append("]}}");
            }
            return;
        }

        // handle Parentheses expression
        if (ctx.operator() == null && ctx.CLOSE_PAR() != null) {
            if (isNotLast(ctx)) {
                query.append(",");
            }
            return;
        }
        String operator = ctx.operator().getText().toUpperCase();
        String field = "";
        if (ctx.field() != null) {
            field = ctx.field().getText();
        } else if (ctx.STRING_LITERAL() != null) {
            field = ctx.STRING_LITERAL().getText();
        } else {
            System.err.println("UNKNOWN FIELD");
        }
        field = field.replaceAll("[\"']", "");

        // Skip empty fields
        if (field.isEmpty()) {
            return;
        }
        // add field to set for validation
        fields.add(field);
        String value = "";
        if (ctx.literal_value() != null) {
            value = ctx.literal_value().getText().replaceAll("[\"']", "");
        } else if (ctx.literal_list() != null) {
            value = ctx.literal_list().getText().replaceAll("[\\[\\]]", "").replaceAll("[()]", "");
        } else if (ctx.function() != null) {
            String function = Hashing.sha256().hashString(ctx.function().getText(), Charsets.UTF_8).toString();
            value = functionResult.get(function).toString();
        } else {
            System.err.println("UNKNOWN VALUE");
        }
        query.append(operatorMap.get(operator).replace("#FIELD_KEY#", field).replace("#FIELD_VALUE#", value));
        if (isNotLast(ctx)) {
            query.append(",");
        }

    }

    @Override
    public void enterFunction(IqlParser.FunctionContext ctx) {
        invokeFunction(ctx);
    }

    @Override
    public void exitFunction(IqlParser.FunctionContext ctx) {
        // Do nothing
    }

    @Override
    public void exitOrdering_term(IqlParser.Ordering_termContext ctx) {
        if (ctx.K_ORDER() == null || ctx.K_BY() == null) {
            return;
        }
        int childCount = ctx.getChildCount();
        String field = "" , order= "asc";
        // Skip first 2 children as they are 'order' and 'by'
        for (int i = 2; i < childCount; i++) {
                field = ctx.getChild(i).getText();
                if(i+1 < childCount){
                    if(",".equals(ctx.getChild(i+1).getText())){
                        order = "asc";
                        i++;
                    }else{
                        order = ctx.getChild(i+1).getText();
                        i+=2;
                    }
                }else{
                    order = "asc";
                }
                Map<String, String> orderMap = new HashMap<>();
                orderMap.put(field, order);
            System.out.println(orderMap);
            sort.add(orderMap);
        }
    }

    public String getQueryDSL() {
        return query.toString();
    }

    public Set<String> getFields() {
        return fields;
    }

    public List<Map<String,String>> getSort() {
        return sort;
    }

    private void invokeFunction(IqlParser.FunctionContext ctx) {
        //@TODO: handle nested functions
        String functionName = ctx.function_name().getText();
        List<IqlParser.Function_paramContext> params = ctx.function_param();
        System.out.println("Function Name: " + functionName);
        System.out.println("Function : " + ctx.getText());
        String hash = Hashing.sha256().hashString(ctx.getText(), Charsets.UTF_8).toString();
        System.out.println("hash code of function : " + hash);
        Function function = registeredFunctions.get(functionName);
        if (function != null) {
            List<Object> parsedParams = new ArrayList<>();
            for (IqlParser.Function_paramContext param : params) {
                parsedParams.add(parseParam(param));
            }
            int i = 0;
            for (Object param : parsedParams) {
                System.out.println("param[" + (++i) + "]:" + param);
            }
            Object result = function.invoke(parsedParams);
            System.out.println("Function Result: " + result);
            functionResult.put(hash, result);

        } else {
            System.err.println("Function not registered: " + functionName);
        }
    }

    private Object parseParam(IqlParser.Function_paramContext param) {
        if (param.literal_value() != null) {
            return param.literal_value().getText();
        }
        if (param.function() != null) {
            return param.function().getText();
        }
        return null;
    }

    private boolean isNotLast(IqlParser.ExprContext ctx) {
        if (!contextStack.isEmpty() && contextStack.peek() instanceof IqlParser.ExprContext parentCtx) {
            return (parentCtx.expr().size() > 1 && parentCtx.expr().getLast() != ctx);
        }
        return false;
    }

    private String appendBooleanQuery(IqlParser.ExprContext ctx) {
        StringBuilder booleanQuery = new StringBuilder();
        if (ctx.K_AND() != null) {
            booleanQuery.append("{ \"bool\": { \"must\": [");
        } else if (ctx.K_OR() != null) {
            booleanQuery.append("{ \"bool\": { \"should\": [");
        } else if (ctx.K_NOT() != null && !ctx.K_NOT().isEmpty()) {
            booleanQuery.append("{ \"bool\": { \"must_not\": [");
        }
        return booleanQuery.toString();
    }
}
