package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> data = new TreeSet<>();
		
		data.add("java");
		data.add("python");
		data.add("ai");
		data.add("golang");
		data.add("react");
		data.add("node");
		data.add("php");
		data.add("node");
		data.add("swift");
		
		Iterator<String> itr = data.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		Iterator<String> ditr = data.descendingIterator();
		
		while(ditr.hasNext()) {
			System.out.print(ditr.next()+ " ");
		}
		
		System.out.println(data.subSet("golang", "node"));
		
		System.out.println(data.ceiling("python"));
		
		System.out.println(data.floor("python"));
//		System.out.println(data);

	}

}
