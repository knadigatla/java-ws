package com.cloudwick.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	private Queue<String> nameQ;
	private Deque<String> nameD;
	
	private void populateQ() {
		nameQ = new LinkedList<String>();
		
		nameQ.add("Kiran");
		nameQ.add("Kumar");
		nameQ.add("Nadigatla");
	}
	private void populateDQ() {
		nameD = new LinkedList<String>();
		
		nameD.add("Kiran1");
		nameD.add("Kumar1");
		nameD.add("Nadigatla1");
	}
	
	private void displayDQ() {
		System.out.println("peek first: "+nameD.peekFirst());
		System.out.println("peek last: "+nameD.peekLast());
		System.out.println("SIze: "+nameD.size());
		System.out.println("Poll first: "+nameD.pollFirst());
		System.out.println("Poll last: "+nameD.pollLast());

		System.out.println("SIze: "+nameD.size());
	}
	

	private void displayQ() {
		System.out.println("peek: "+nameQ.peek());
		System.out.println("SIze: "+nameQ.size());
		System.out.println("Poll: "+nameQ.poll());
		System.out.println("SIze: "+nameQ.size());
		System.out.println("peek: "+nameQ.peek());


	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueExample q = new QueueExample();
		q.populateQ();
		q.displayQ();
		
		q.populateDQ();
		q.displayDQ();
		
	}

}
