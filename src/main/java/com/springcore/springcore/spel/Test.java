package com.springcore.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/spel/spelConfig.xml");
        Spel spel = context.getBean("spel", Spel.class);
        System.out.println(spel);

        // Another way to use SpEL as a Parser
        ExpressionParser tempExpressionParser = new SpelExpressionParser();
        Expression expression = tempExpressionParser.parseExpression("34+585");
        System.out.println(expression.getValue());  // prints 619
    }
}
