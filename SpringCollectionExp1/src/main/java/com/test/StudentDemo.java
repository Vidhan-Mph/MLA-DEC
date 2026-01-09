package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ct= new AnnotationConfigApplicationContext(ConfigStud.class);
		
		Student s1 = ct.getBean("getSetterObj", Student.class);
		s1.setId(101);
		s1.setName("Jay");
		List<String> skills = Arrays.asList("java", "php", "node" ,"ui");
		s1.setSkills(skills);
		s1.setCollege("KSJIT");
		System.out.println(s1);
		
		Student s2 = ct .getBean("getConstObj", Student.class);
		System.out.println(s2);
	}

}
