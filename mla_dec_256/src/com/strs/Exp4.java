package com.strs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Car
{
	int id;
	String name;
	
	public Car(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
}

public class Exp4 {
	
	public static void main(String[] args) {
		
		Car[] crdt = {new Car(1,"apple"), new Car(2, "Tesla")};
		
		for(Car dt : crdt)
		{
			System.out.println(dt);
		}
		
		String str = "java";
		
		System.out.println(Pattern.matches(str, "java"));
		
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));
		
		String pwdptrn = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&()_+-])(?=\\S+$).{8,20}$";
		
		final Pattern ptrn = Pattern.compile(pwdptrn);
		
		String pass = "alalla@12345";
		
		Matcher mt = ptrn.matcher(pass);
		
		System.out.println(mt.matches());
	}
}
