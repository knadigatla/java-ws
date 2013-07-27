package com.cloudwick.threads;

public class Resource {
	
	public synchronized void lock() {
		System.out.println(Thread.currentThread().getName()+" is locked");
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" is released");
	}

}
