package com.test;

@FunctionalInterface
interface FunInf1
{
	void userData();
}



public class Exp14 {
	
	public static void main(String[] args) {
		
		
		//BEFORE JDK 8 IMPLEMENTATION
		
		FunInf1 obj = new FunInf1() {
			
			@Override
			public void userData()
			{
				System.out.println("overrided");
			}
			
		};
		
		obj.userData();
		
		new FunInf1() {
		
			@Override
			public void userData()
			{
				System.out.println("nameless object");
			}
		}.userData();
		
		//JAVA 8 
		FunInf1 obj1 = () ->{
			System.out.println("default method");
		};
		
		obj1.userData();
		
	}
}
