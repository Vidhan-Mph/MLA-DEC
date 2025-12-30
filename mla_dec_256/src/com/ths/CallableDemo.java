package com.ths;

import java.util.concurrent.*;

class SimpleMaths implements Callable<Integer>{
	
	private final int count;
	
	public SimpleMaths(int count) {
		this.count= count;
	}

	@Override
	public Integer call() throws Exception {
		int add =0;
		 for(int i =1;i<=count;i++) {
			 add+=i;
			 Thread.sleep(500);
		 }
		 System.out.println("Count value: " + add +" "+ Thread.currentThread().getName()); //output step: 2
		return add;
	}
	
}

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		SimpleMaths task = new SimpleMaths(10);
		
		Future<Integer> future = executor.submit(task); //future calls overriden call() method 
		                                               //from SimpleMaths class which implements Callable interface with generic Integer value		
		System.out.println("Task Submitted");		//output step: 1 
		
		try {
			int rslt = future.get();
			System.out.println("The result from callable task: "+rslt);		//output step: 3
		}catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		executor.shutdown();

	}

}
