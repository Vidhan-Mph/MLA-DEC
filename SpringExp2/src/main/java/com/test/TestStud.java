package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class TestStud {
	public static void main(String[] args) {
	
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigStudent.class);
	
	Student std1=ctx.getBean("getSetterObj",Student.class);
	std1.setId(201);
	std1.setName("Vidhan");
	std1.setAge(22);
	std1.setPercentage(100);
	
	
	
	
	
	System.out.println(std1);
	
	Student std2=ctx.getBean("getConstObj",Student.class);
	
	System.out.println(std2);
	}
}
