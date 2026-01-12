package com.test;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		User obj = ctx.getBean("user", User.class);
		System.out.println(obj);
		
		ExpressionParser exp=new SpelExpressionParser();
		
		//String str="java";
		
		org.springframework.expression.Expression ex = exp.parseExpression("'this is simple string literal example'");	
		String str=ex.getValue(String.class);
		
		System.out.println("Literal exp"+" "+str);
		
		org.springframework.expression.Expression exp1=exp.parseExpression("'Simple SpEL mla banglore'".toUpperCase());
		
		String upr=exp1.getValue(String.class);
		
		System.out.println("String UpperCase Method:"+upr);
		org.springframework.expression.Expression exp2=exp.parseExpression("55*7");
		Integer a=exp2.getValue(Integer.class);
		
		System.out.println("NUmerical data"+" "+a);
		
	
	
	}
	
	

}
