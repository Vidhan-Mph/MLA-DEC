package com.excp;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Exp1 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/5);
			
			String str = "java";
			
			System.out.println(str.charAt(1));
			
			int x = Integer.parseInt("11.00");
			
			System.out.println(x);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("don't enter zero den");
		}
		catch(NullPointerException npe)
		{
			System.out.println("string input mandatory");
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("check string length");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check array length");
		}
		catch(Exception e)
		{
			System.out.println("check your inputs");
		}
		finally
		{
			//close the resources
			
			//Scanner sc = new Scanner(System.in);
			
			try(Scanner sc = new Scanner(System.in); FileOutputStream fos = new FileOutputStream(""))
			{
				sc.close();
				fos.close();
			}
			catch(Exception e)
			{
				
			}
			finally
			{
				
			}
		}
	}
}
