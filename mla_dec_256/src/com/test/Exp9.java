package com.test;


class Book
{
	static int pincode = 234234;
		   int atmpin = 3030;

	public Book()
	{
		 System.out.println("constructor");//4
	}

	static
	{
	  System.out.println("static block "+pincode);//2
	}

	{
	  System.out.println("instance block "+atmpin);//3
	}
}

class Exp9
{
	public static void main(String[] args)
	{
		System.out.println("main method");//1

		Book obj1 = new Book();
		System.out.println(obj1);
	}
}