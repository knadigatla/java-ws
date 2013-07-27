package com.cloudwick.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsClass {
	
	private static final int NUMBER_OF_THREADS = 100;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService excutr = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
		
		for(int i=0; i<500; i++) {
			MyThreadClass obj = new MyThreadClass(50000+i);
			excutr.execute(obj);
		}
		
		excutr.shutdown();
		
		while(!excutr.isTerminated()) {
			
		}
//		Thread.sleep(5000);
		
		
		System.out.println("All Threads finished!");
	}

}
