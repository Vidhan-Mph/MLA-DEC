package com.strms;

import java.util.Arrays;
import java.util.List;

public class Exp3 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20,30,40,50);
		List<Integer> list2 = Arrays.asList(11,22,33,44,55);
		
		List<List<Integer>> l3 = Arrays.asList(list1,list2);
		System.out.println(l3);
		List<Integer> fltmp = l3.stream()
				.flatMap(List::stream)
				.toList();
		
		System.out.println(fltmp);

	}

}
