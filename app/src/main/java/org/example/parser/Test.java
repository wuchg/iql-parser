package org.example.parser;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {

//        '类型' in ["线上Bug"] and '创建时间' >= '2024-01-01' and '创建时间' <= '2024-03-31' and '所属产品' in ["code"] and 'QA引入原因分析' in ["无法复现"] and '状态' not in ["已取消"];
//        '迭代' in ["6eLLzzz3or"];
//        '类型' in ("升级工单") and '计划部署时间' > startOfWeek(-7d);
//        abcx in ('a','b','c');
//        abc < 10 and efc > 3 and efd!=30;
//        (color1='red1' OR color1='blue') and (pric1e=2000 OR mode1l='hyundai' );
//        (color='red' OR color='blue') and (price=2000 OR model='hyundai' );

        String iql = "(COMMENT=\"red1\" OR 'color1'=\"blue\") and ('pric1e'=2000 and 'mode1l'=\"hyundai\") and '计划部署时间' > sum(1,100) and '类型' in [ \"线上Bug\"] and '创建时间' >= '2024-01-01' and '创建时间' <= '2024-03-31' and '所属产品' = \"code\" and 'xxx' not in [\"a\",\"b\",\"c\"]  and 'QA引入原因分析' in ( \"无法复现\") and '状态' != \"已取消\"";
        CharStream input = CharStreams.fromString(iql);

        // Create a lexer instance
        IqlLexer lexer = new IqlLexer(input);

        // Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser instance
        IqlParser parser = new IqlParser(tokens);

        // Parse the input and generate the parse tree
        ParseTree tree = parser.query(); // Replace ruleName with your starting rule

        // 创建自定义的 Listener
        CustomIqlListener listener = new CustomIqlListener();

        // 使用 ParseTreeWalker 来遍历语法树并触发 Listener 中的方法
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        String queryDSL = listener.getQueryDSL();
        System.out.println(queryDSL);

        listener.getFields().stream().map(f -> f + " ").forEach(System.out::print);

        // Create the TreeViewer
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.5); // Scale a bit

        // Show the TreeViewer in a JFrame
        JFrame frame = new JFrame("Parse Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(viewer);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }
}


