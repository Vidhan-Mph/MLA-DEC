package com.test;

interface Inf2
{
	public void book();
	
	private void color()
	{
		System.out.println("private method");
	}
	
	static void human()
	{
		System.out.println("static method");
	}
	
	default void animal()
	{
		System.out.println("default method");
		
		color();
	}
}

class Impl3 implements Inf2
{
	@Override
	public void book()
	{
		System.out.println("implemented method");
	}
}

public class Exp11 {
	
	public static void main(String[] args) {
		
		Inf2 obj = new Impl3();
		
		obj.book();
		obj.animal();
		Inf2.human();
	}
}
