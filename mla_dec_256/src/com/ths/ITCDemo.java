package com.ths;
class Item{
	public int value;
	public boolean valSet;
	
	public synchronized void setItem(int input) {			// Object level Thread safety locking
		try {
			if(valSet) {
				wait();										//java.lang.Object class
			}
			
			value = input;
			valSet = true;
			System.out.println("one item produced -> "+value);
			notify();										//notify to other (only one)thread
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void getItem() {
		try {
			if(!valSet) {
				wait();
			}
			System.out.println("one item consumed -> "+ value);
			
			valSet = false;
			notify();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable{

	private Item item;
	public int i;
	public Producer(Item item) {
		this.item = item;
	}
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				item.setItem(++i);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}

class Consumer implements Runnable{

	private Item item;
	public Consumer(Item item) {
		this.item = item;
	}
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(500);
				item.getItem();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}

public class ITCDemo {

	public static void main(String[] args) {
		Item item = new Item();
		
		Thread pr = new Thread(new Producer(item), "Producer");
		Thread cr = new Thread(new Consumer(item), "Consumer");
		pr.start();
		cr.start();
		
		System.out.println(pr.getName());
		System.out.println(cr.getName());
		
		pr.setPriority(10);
		cr.setPriority(1);
		
		System.out.println("Producer thread priority: " +pr.getPriority());
		System.out.println("Producer thread priority: " +cr.getPriority());
	

	}

}
