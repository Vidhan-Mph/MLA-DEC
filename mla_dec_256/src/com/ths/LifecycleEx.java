package com.ths;

public class LifecycleEx implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("t1 run()");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception{
		LifecycleEx obj = new LifecycleEx();
		
//		obj.run();
		Thread t1 = new Thread(obj);
		
		System.out.println("Before starting thread state: " +t1.getState());
		System.out.println("Before starting thread status: " +t1.isAlive());
		
		
		t1.start();
		
		
		System.out.println("After starting thread state: " +t1.getState()); //Thread start executes after this line.
		System.out.println("After starting thread status: " +t1.isAlive());
		
		
		Thread.sleep(500);
		
		
		System.out.println("In sleep thread state: " +t1.getState()); 
		System.out.println("In sleep thread status: " +t1.isAlive());
		
		
		t1.join();
		
		
		System.out.println("After join() thread state: " +t1.getState()); 
		System.out.println("After join() thread status: " +t1.isAlive());
		
		
//		System.out.println("Thread 1 started");
//		
//		Runnable t2 = () -> {
//			System.out.println("t2 run()");
//		};
//		Thread t21 = new Thread(t2);
//		t21.start();
//		
//		Thread t3 = new Thread(() -> System.out.println("run() lambda expression"));
//		
//		t3.start();
//		System.out.println("Thread 3 start");

	}

}
