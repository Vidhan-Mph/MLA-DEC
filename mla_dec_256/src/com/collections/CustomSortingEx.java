package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book implements Comparable<Book>{
	private int id;
	private String name;
	private int price;
	
	public Book(int id, String name, int price) {
		this.id = id;
		this.name= name;
		this.price = price;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.price-o.price;
	}
	
	
}

class NameComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {

		return o2.getName().compareTo(o1.getName());
	}
	
}

public class CustomSortingEx {

	public static void main(String[] args) {
		
		List<Book> data = new ArrayList<>();
		
		data.add(new Book(101,"Java" ,100));
		data.add(new Book(102,"Maths" ,200));
		data.add(new Book(201,"GoLang" ,500));
		data.add(new Book(301,"React" ,250));
		data.add(new Book(104,"Python" ,99));
		data.add(new Book(203,"Kotlin" ,150));
		
//		System.out.println(data); //Because of toString it prints values not hashcode
//		
//		Collections.sort(data);
//		data.forEach(System.out::println);
//		
//		Collections.reverse(data);
//		data.forEach(System.out::println);
//		
//		Collections.shuffle(data);
//		data.forEach(System.out::println);
		
		Collections.sort(data, new NameComparator());
		data.forEach(System.out::println);
	}

}
