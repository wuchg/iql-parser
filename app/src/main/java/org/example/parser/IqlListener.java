// Generated from Iql.g4 by ANTLR 4.13.2
package org.example.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IqlParser}.
 */
public interface IqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(IqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(IqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#iql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIql_stmt(IqlParser.Iql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#iql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIql_stmt(IqlParser.Iql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(IqlParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(IqlParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(IqlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(IqlParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(IqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(IqlParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(IqlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(IqlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(IqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(IqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(IqlParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(IqlParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#literal_list}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_list(IqlParser.Literal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#literal_list}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_list(IqlParser.Literal_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(IqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(IqlParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#state_name}.
	 * @param ctx the parse tree
	 */
	void enterState_name(IqlParser.State_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#state_name}.
	 * @param ctx the parse tree
	 */
	void exitState_name(IqlParser.State_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(IqlParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(IqlParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#compare_dates}.
	 * @param ctx the parse tree
	 */
	void enterCompare_dates(IqlParser.Compare_datesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#compare_dates}.
	 * @param ctx the parse tree
	 */
	void exitCompare_dates(IqlParser.Compare_datesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IqlParser#dates}.
	 * @param ctx the parse tree
	 */
	void enterDates(IqlParser.DatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IqlParser#dates}.
	 * @param ctx the parse tree
	 */
	void exitDates(IqlParser.DatesContext ctx);
}