package com.test.model;

public class Customer {
private int id;
private String c_name;
private String c_city;
private String c_state;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public String getC_city() {
	return c_city;
}
public void setC_city(String c_city) {
	this.c_city = c_city;
}
public String getC_state() {
	return c_state;
}
public void setC_state(String c_state) {
	this.c_state = c_state;
}
public Customer(int id, String c_name, String c_city, String c_state) {
	super();
	this.id = id;
	this.c_name = c_name;
	this.c_city = c_city;
	this.c_state = c_state;
}
@Override
public String toString() {
	return String.format("Customer [id=%s, c_name=%s, c_city=%s, c_state=%s]", id, c_name, c_city, c_state);
}
public Customer() {
	super();
}


}
