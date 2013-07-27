package com.cloudwick.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFileManager {

	private static final int NUMBER_OF_THREADS = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService excutr = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		File startingDirectory= new File("C:\\Users\\Kiran\\Desktop\\java_pract");
		
		try {
			List<File> files = FileHelpers.getFileListing(startingDirectory);
			for (File fn:files) {
				
				CallableFileThread obj = new CallableFileThread(fn);
				Future<Integer> f = excutr.submit(obj);
				list.add(f);
			}
			excutr.shutdown();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		

		System.out.println("Threads: "+list.size());
		int sum =0;
		for(Future<Integer> data:list) {
			try {
				sum+=data.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("the sum is "+sum);
			
	}

	
}
