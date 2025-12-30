package com.inhs;

class C{
	public void show() {
		System.out.println("Top Most Parent");
	}
}
class D extends C{
	public void cat() {
		System.out.println("Cat");
	}
}

class E extends D{
	
	public void dog() {
		System.out.println("Dog");
	}
}

class F extends E{
	public void fox() {
		System.out.println("Fox");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		F f = new F();
		System.out.println(f);
	}

}
