package com.test;
class Exp2
{
	//types of variables in java

	//global variables

	int x;
	double y;
	char z;
	boolean a;

	public void disp()
	{

	  //local variables

	   long j = 11;
	   float k = 323.33f;

	   System.out.println(x);//0
	   System.out.println(y);//0.0
	   System.out.println(z);//null
	   System.out.println(a);//false
	   System.out.println(j);//0.0
	   System.out.println(k);//0.0

	}

	public static void main(String[] abc)
	{
		Exp2 obj = new Exp2();
		
		obj.disp();
	}
}