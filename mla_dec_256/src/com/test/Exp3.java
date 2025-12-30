package com.test;
class Exp3
{
	Integer x = 234;
	Float y = 33.22f;

	public void show()
	{
	  System.out.println(x+x);
	  System.out.println(y);
	}

	public static void main(String[] args)
	{
	  Exp3 obj = new Exp3();

	  obj.show();
	}
}