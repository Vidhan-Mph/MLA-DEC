package com.test;

public class Student {
private int id;
private String name;

public Student() {
	super();
}
@Override
public String toString() {
	return String.format("Student [id=%s, name=%s, age=%s, percentage=%s]", id, name, age, percentage);
}
public Student(int id, String name, int age, int percentage) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.percentage = percentage;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
private int age;
private int percentage;

}
