package com.strms;

import java.util.Arrays;
import java.util.List;

public class Exp2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sky", "kohli" ,"dhoni", "dravid");
		
		names.stream()
		.map(String::toUpperCase)   //Static method reference using class
		.forEach(System.out::println); //Non Static method reference using object
		
		List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8);
		
		nums.stream()
		.map(x -> x*x)
		.forEach(System.out::println);

	}

}
