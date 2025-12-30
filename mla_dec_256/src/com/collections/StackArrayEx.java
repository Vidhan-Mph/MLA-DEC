package com.collections;
class StackArray{
	private int maxSize;
	private int[] arr;
	private int top;
	
	public StackArray(int size) {
		this.maxSize = size;
		this.arr = new int[maxSize];
		this.top = -1;
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = value;
		System.out.println("Element pushed in stack: " +value);
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		
		int tp = arr[top];
		top--;
		System.out.println("Element popped from stack: " +tp);
		
		return tp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("No top element");
			return -1;
		}
		return arr[top];
	}
}

public class StackArrayEx {

	public static void main(String[] args) {
		StackArray stack = new StackArray(5);
		
		stack.push(11);
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.push(7);
		
		System.out.println(stack.peek());
		
		stack.pop();

	}

}
