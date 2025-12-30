package com.test;

class Employee
{
	int id;
	String name;
	String cmp;

	public Employee()
	{
	  System.out.println("default constructor");
	}

	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	  System.out.println("parameterised constructor "+id+" "+name);
	}

	public Employee(int id, String name, String cmp)
	{
	  System.out.println("overloaded constructor");
	}

	public Employee(Employee obj)
	{
	  System.out.println("object parameterised constructor");
	}

	public static void main(String[] args)
	{
	  Employee obj1 = new Employee();
	  Employee obj2 = new Employee(101, "Dhoni");
	  Employee obj3 = new Employee(101, "Kohli", "BCC");
	  Employee obj4 = new Employee(obj1);
	  System.out.println(obj1 + " " + obj2 + " " + obj3+ " " + obj4);
	}
}