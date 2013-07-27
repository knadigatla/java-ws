package com.cloudwick.threads;

public class SynchronizationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource obj = new Resource();
		AnotherThreadClass a = new AnotherThreadClass(obj, "one");
		a.start();
		AnotherThreadClass b = new AnotherThreadClass(obj, "two");
		b.start();

	}

}
