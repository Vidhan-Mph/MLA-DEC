package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigStudent {
@Bean
	public Student getSetterObj() {
		return new Student();

	}
@Bean	
	public Student getConstObj() {
		return new Student(201,"Jay",22,100);

	}

}
