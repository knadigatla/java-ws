package com.cloudwick.threads;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Long> {

	private int counter;

	public CallableThread(int num) {
		counter = num;
	}
	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		long sum=0;

		for(long i=0; i <counter; i++) {
			sum += i;
		}
		return sum;
	}

}
