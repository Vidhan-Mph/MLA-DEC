package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet data = new HashSet();
		
		LinkedHashSet data = new LinkedHashSet();
		
//		TreeSet data = new TreeSet();
		data.add(100);
		data.add("Jay");
		data.add('a');
		data.add(100);
		data.add(1000);
		data.add(21.21);
		data.add("Mummy");
		data.add(true);
		data.add(data);
		data.add('j');
		
//		System.out.println(data.size());
		
		Iterator itr = data.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
