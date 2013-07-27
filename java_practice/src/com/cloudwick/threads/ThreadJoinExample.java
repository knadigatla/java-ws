package com.cloudwick.threads;

public class ThreadJoinExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current thread started :"+Thread.currentThread().getName());
		
		Thread t = new Thread() {
			public void run() {
				System.out.println("Thread started:"+Thread.currentThread().getName());
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread Complete:"+Thread.currentThread().getName());
			}
		};
		
		t.start();
		try {
			t.join();	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Current Thread completed:"+Thread.currentThread().getName());
	}

}
