package com.api;

import java.util.Arrays;
import java.util.List;

class Customer{
	
}

public class Exp3 {

	//UpperBounded Wildcards using extends
	private static double add(List<? extends Number> list) {
		double a =0;
		for(Number n: list) {
			a = n.doubleValue();
			a+=a;
		}
		return a;
	}
	
	public static void lowerBounded(List<? super Integer> list) {
		System.out.println(list);
	}
	
	//Unbounded wildcards (Any type of data)
	public static void unboundedData(List<?> list) {
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		//Upper Bounded WildCard Syntax
		List<Integer> list1 = Arrays.asList(12,3,4,5);
		add(list1);
		
		List<Double> lis2 = Arrays.asList(34.44,33.55,55.44);
		add(lis2);
		
		//LowerBounded Syntax
		lowerBounded(list1);
		//unbounded Syntax
		unboundedData(lis2);
		
		List<String> names = Arrays.asList("java", "python", "spring");
		unboundedData(names);
		
		List<Customer> lstc = Arrays.asList(new Customer());
		unboundedData(lstc);
	}
}
