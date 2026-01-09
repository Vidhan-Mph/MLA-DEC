package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bn=new ClassPathXmlApplicationContext("beans.xml");

		Student obj=bn.getBean("std",Student.class);

		Student obj2=(Student)bn.getBean("std1");//another way of crating bean or object


		System.out.println("setter injection");
		System.out.println(obj);
		System.out.println("constructor injection");
		System.out.println(obj2);
	}

}
