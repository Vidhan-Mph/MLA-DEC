package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List data = new ArrayList<>();
		
		Collection data1 = new ArrayList<>();
		
		ArrayList data2 = new ArrayList();
		
		data.add(100);
		data.add("Jay");
		data.add('a');
		data.add(100);
		
		data1.add(1000);
		data1.add(21.21);
		data1.add("Mummy");
		
		data2.add(true);
		data2.add(data);
		data2.add('j');
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
		
		System.out.println(data.getFirst());
		System.out.println(data2.getLast());
		System.out.println(data.get(0) + " " + data2.get(1));
		System.out.println(data2.size());
		System.out.println(data.set(3, "MLA"));
		System.out.println(data2.remove(2));
		
		Iterator itr = data1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		ListIterator litr = data.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		System.out.println();
		
		System.out.println("=========");
		
		
		while(litr.hasPrevious()) {
			System.out.print(litr.previous()+ " ");
		}
	}

}
