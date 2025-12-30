package com.test;

import java.util.Scanner;

class Exp6
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter a number");

	  int x = sc.nextInt();

	  if(x%2 == 0)
	  {
	    System.out.println("the given number is even : "+x);
	  }
	  else
	  {
	   System.out.println("the given number is odd : "+x);
	  }
	  sc.close();
	}
	
}