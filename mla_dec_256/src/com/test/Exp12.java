package com.test;

interface Inf3
{
	void add();
	
	interface Inf4 {
	
	void sub();
	
	}
}

class Impl4 implements Inf3.Inf4
{
	@Override
	public void sub()
	{
		System.out.println("sub()");
	}
}

public class Exp12 {
	
	public static void main(String[] args) {
		
		Impl4 obj = new Impl4();
		
		obj.sub();
		
	}
}
