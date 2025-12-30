package com.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack data = new Stack();
		
		data.add(100);
		data.add("Jay");
		data.add('a');
		data.add(1234);
		
		System.out.println(data); // Maintains insertion order
		
		System.out.println(data.peek()); //Output the top most element in stack
		data.push("Manek"); //put in new element
		
		System.out.println(data.peek());
		
		data.pop(); //remove topmost element
		System.out.println(data.peek());
		
		System.out.println(data.search(100));//outputs the position in stack if present, if not present -1
		System.out.println(data.get(0)); //index based searching based on insertion order
		
		System.out.println(data.contains(100)); //Outputs boolean if present or not
		
		data.clear(); //remove elements from stack but variable still exists
		System.out.println(data.empty()); //is empty or not

	}

}
