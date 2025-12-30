package com.strs;

public class Exp1 {
	
	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		String e = "java";
		
		String c = new String("hello");
		String d = new String("hello");
		
		System.out.println(a == b);//true
		System.out.println(a == e);//false
		System.out.println(a == c);//false
		System.out.println(b == d);//false
		
		System.out.println(c == d);//false
		
		System.out.println(b.equals(d));//true 
		
		a.concat(" hi bye...");
		
		System.out.println(a);
	}

}
