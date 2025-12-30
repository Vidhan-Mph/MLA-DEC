package com.collections;

import java.util.EmptyStackException;

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		this.next = null;
		
	}
}
class StackLinkedList<T>{
	
	private Node<T> top;
	private int size;
	public StackLinkedList() {
		this.top = null;
		this.size=0;
	}
	
	public boolean isEmpty() {
		return top == null;	
	}
	
	public int size() {
		return size;
	}
	
	public void push(T element) {
		Node<T> newNode = new Node<>(element);
		newNode.next = top;
		top = newNode;
		size++;
		System.out.println("Pushed element in stack: "+element);
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack Empty.");
			throw(new EmptyStackException()); 
		}
		T poppedElement = top.data;
		top = top.next;
		size--;
		return poppedElement;	
	}
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack Empty");
			throw(new EmptyStackException());
		}
		return top.data;
	}
}
public class StackLinkedListEx {

	public static void main(String[] args) {
		StackLinkedList<Integer> data = new StackLinkedList<>();
		data.push(100);
		data.push(200);
		data.push(300);
		data.push(400);
		data.push(500);
		
		System.out.println("Top element: "+ data.peek());
		System.out.println("Size: "+ data.size());
		System.out.println("Popped element: "+ data.pop());
		System.out.println("Top Element: " + data.peek());
		System.out.println("Empty data? " + data.isEmpty());

	}

}
