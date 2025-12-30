package com.designs;

//Singleton Design: Many request only one object
//Using lazy Loading (Loading object after request)
class Singleton1{
	public static Singleton1 obj;
	private Singleton1(){
		
	}
	
	public static Singleton1 getInstance() {
		if(obj == null) {
			obj = new Singleton1();
		}
		return obj;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		Singleton1 obj1 = Singleton1.getInstance();
		
		Singleton1 obj2 = Singleton1.getInstance();
		
		System.out.println(obj1.hashCode() + " " + obj2.hashCode());

	}

}
