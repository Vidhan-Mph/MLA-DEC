package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory bn=new ClassPathXmlApplicationContext("beans.xml");

Employee obj=bn.getBean("emp",Employee.class);

Employee obj2=(Employee)bn.getBean("emp1");//another way of crating bean or object


System.out.println("setter injection");
System.out.println(obj);
System.out.println("constructor injection");
System.out.println(obj2);
	}

}
