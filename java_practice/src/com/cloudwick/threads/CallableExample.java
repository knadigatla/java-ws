package com.cloudwick.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	private static final int NUMBER_OF_THREADS = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService excutr = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

		List<Future<Long>> list = new ArrayList<Future<Long>>();

		for (int i=0; i<2000; i++) {
			CallableThread obj = new CallableThread(1000+i);
			Future<Long> f = excutr.submit(obj);
			list.add(f);
		}
		excutr.shutdown();

		System.out.println("Threads: "+list.size());
		int counter =0;
		for(Future<Long> data:list) {
			try {
				System.out.println(counter+":"+data.get());
				counter++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	
}
