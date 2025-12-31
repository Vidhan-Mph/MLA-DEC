package com.test;
 
public class GCExp1// implements AutoCloseable
{
	private int objId;                                   
	
	public GCExp1(int objId) {
		this.objId = objId;
		System.out.println("Object Created " + objId);
	}
	
	@Override
	protected void finalize() throws Throwable{
		
		try {
			System.out.println("Object released (Garbage collection)");
		}finally{
			super.finalize();
		}
	}
	
//	@Override
//	public void close() {
//		System.out.println("Closing resources");
//	}
// 
	public static void main(String[] args) throws Exception{
		
		GCExp1 obj = new GCExp1(1);
		GCExp1 obj2 = new GCExp1(2);
		obj=null;
		obj2=null;
		System.out.println("Null obj");
//		System.gc();
		Runtime.getRuntime().gc();
		Thread.sleep(2000);
		
		System.out.println("Main method end");
		
		
	}
 
}