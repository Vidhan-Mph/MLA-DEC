package com.map;

import java.util.TreeMap;

public class Exp2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> data = new TreeMap<>();
		
		data.put("orange", 10);
		data.put("banana", 20);
		data.put("sprouts", 20);
		data.put("orange", 250);
		data.put("millets",110);
		data.put("mango", 210);
		data.put("apple", null);
		data.put("mango", 300);
		data.put("zen", 33);
//		data.put(null, null);
		System.out.println(data);
		
		data.forEach((k,v) -> System.out.println(k+"<=>"+v));
		
		
	}

}
