package com.designs;

interface Book{
	Book bookDetails();
}

class Parent1{
	public void greetUser() {
		System.out.println("parent");
	}
}

class Child1 extends Parent1{
	public void sendMsg(String msg) {
		greetUser();
		System.out.println("Calling Parent Method");
	}
	@Override
	public void greetUser() {
		System.out.println("Overrided");
		sendMsg("Hi Factory method");
	}
	public static Parent1 getInstance(){
		return new Parent1();
	}
}
public class FactoryDemo {

	public static void main(String[] args) {
		

	}

}
