package com.cloudwick.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Thread> alist = new ArrayList<Thread>();
		
		for(int i=0; i<500; i++) {
			MyThreadClass obj = new MyThreadClass(5000000+i);
			obj.setName("user"+i);
			obj.start();
			alist.add(obj);
		}
		
		int running = 0;
		do{
			running = 0;
			for(Thread a: alist) {
				if(a.isAlive())
					running++;
				}
		}while(running>0);
		
		System.out.println("All the Threads are complete");
	}

}
