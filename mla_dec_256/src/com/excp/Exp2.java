package com.excp;

public class Exp2 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			//using getMessage()
			System.out.println(e.getMessage());
			
			//printing exception class object
			System.out.println(e);
			
			e.printStackTrace();
		}
	}
}
