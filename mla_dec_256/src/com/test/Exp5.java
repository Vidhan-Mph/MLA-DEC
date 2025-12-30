package com.test;
class Exp5
{
	public static void main(String[] args)
	{
	  for(int i = 0; i <= 10; i+=2)
	  {
	    System.out.println(i);
	  }

	  int y = 1;

	  while(y <= 10)
	  {
	  	System.out.println(y);

	  	y += 2;
	  }

	  //write a java program to print series of numbers like
	  // N.....512,256,.....2

	  int j = 512;

	  while(j>=2)
	  {
	  	System.out.print(j+" ");

	  	j/=2;
	  }

	}
}