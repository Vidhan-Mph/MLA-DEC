package com.api;

import java.util.ArrayList;
import java.util.List;

public class Exp2 {

	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<>();
		data.add("php");
		data.add("java");
		data.add("pyhton");
		data.add("ai");
		data.add("spring");
		
//		for(String dt :data) {
//			System.out.println(dt.startsWith("p"));
//		}
		
		List<String> fltr = 
				data.stream()
				.filter(x -> x.startsWith("p"))
				.toList();
		System.out.println(fltr);
	}

}
