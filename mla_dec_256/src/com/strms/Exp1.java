package com.strms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Book{
	private int id;
	private String name;
	private int price;
	
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
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
		return "Book [id=" + id + ", name=" + name + ", age=" + price + "]";
	}
}

public class Exp1 {

	public static void main(String[] args) {
		
		List<Book> data = Arrays.asList(
				new Book(101,"java",340),
				new Book(102,"python",300),
				new Book(103,"c",200),
				new Book(104,"golang",150),
				new Book(105,"swift",350));
		
		Function<Book,String> fnf = Book::getName;
		Function<Book, Integer> fni = Book::getId;
		Function<Book,Integer> fnp = Book::getPrice;
		
		data.stream().sorted(Comparator
				.comparing(fnp)
				.thenComparing(fni)
				.thenComparing(fnf))
		.forEach(System.out::println);
		
		Supplier<Double> dt = () -> Math.random();
		System.out.println(dt.get());
		
		Map<Book, Integer> mp = new HashMap<>();
		
		for(Book bk:data) {
			mp.put(bk,bk.getId());
		}
		
		Map<Book,Integer> mp1 = data.stream().collect(Collectors.toMap(Function.identity(),Book::getId));
		
		System.out.println(mp1);
		
		Map<Integer,List<String>> mp2 = data.stream().collect(Collectors
				.groupingBy(Book::getId, 
						Collectors.mapping(Book::getName, Collectors.toList())));
		
		System.out.println(mp2);
		
		

	}

}
