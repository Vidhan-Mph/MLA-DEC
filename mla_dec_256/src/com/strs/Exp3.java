package com.strs;

public class Exp3 {
	
	public static void main(String[] args) {
		
		String str1 = "java";
		
		StringBuffer sb = new StringBuffer(str1);
		
		str1.concat(" 25 V");
		
		System.out.println(str1);
		
		sb.append(" 25 V");
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.repeat(" Developer ", 3));
		
		System.out.println(str1.repeat(3));
	}
}
