package com.sanju;

import java.time.LocalDate;
import java.time.Month;

public class Test {
	
	static final String str = null;
	
	
	public static void main(String[] args) {
		
		int[] ar = new int[5];
		
		ar[1] = 1;
		
		//ar[2] = Integer.parseInt(null);
		
		System.out.println(ar[1]);
		
		LocalDate std = LocalDate.of(2016, Month.JUNE, 01);
		
		int d = std.plusDays(10).minusDays(20).plusWeeks(2).getMonthValue();
		
		System.out.println(d);
		
		
		
		
	}

}
