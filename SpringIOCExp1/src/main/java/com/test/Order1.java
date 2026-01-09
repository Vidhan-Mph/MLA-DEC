package com.test;

public class Order1 {
private int id;

public Order1(int id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

public Order1() {
	super();
}

@Override
public String toString() {
	return String.format("Order1 [id=%s, name=%s, price=%s]", id, name, price);
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

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

private  String name;

private int price;
}
