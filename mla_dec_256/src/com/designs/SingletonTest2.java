package com.designs;
//Double checking  + Thread-safety

class Singleton2 {
	public static Singleton2 obj;
	
	private Singleton2() {
		
	}
	
	public static synchronized Singleton2 getInstance() {
		if(obj == null) {
			synchronized (Singleton2.class) {
				if(obj ==null) {
					obj = new Singleton2();
				}
			}
			
		}
		return obj;
	}
	
}

public class SingletonTest2 {

	public static void main(String[] args) {
		Singleton2 obj1 = Singleton2.getInstance();
		
		Singleton2 obj2 = Singleton2.getInstance();
		
		System.out.println(obj1.hashCode() + " " + obj2.hashCode());

	}

}
