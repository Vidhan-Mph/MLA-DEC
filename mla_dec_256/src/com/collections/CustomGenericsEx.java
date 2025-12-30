package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomGenericsEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jay", "Riddhi","Vidhan", "Akash", "Parth", "Rudra");
		
		Collections.sort(names);
		names.forEach(System.out::println);
		
		Collections.shuffle(names);
		names.forEach(System.out::println); //:: -> Method reference

	}

}
