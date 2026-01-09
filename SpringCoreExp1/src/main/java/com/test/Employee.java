package com.test;

public class Employee {
private  int id;

private String name;


public Employee() {
	super();
}

public Employee(int id, String name, String cmp, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.cmp = cmp;
	this.salary = salary;
}

private String cmp;

private int salary;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCmp() {
	return cmp;
}

public void setCmp(String cmp) {
	this.cmp = cmp;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return String.format("Employee [id=%s, name=%s, cmp=%s, salary=%s]", id, name, cmp, salary);
}

}
