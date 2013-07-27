package com.cloudwick.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
;

public class ListExample {

	private List<String> nameList;

	private void populateList() {
		nameList = new ArrayList<String>();

		nameList.add("Fremont");
		nameList.add("Hayward");
		nameList.add("Sanjose");
		nameList.add("Richmond");
	}

	private void deleteElement(int counter) {
		nameList.remove(counter);
	}

	private void displayList() {
		// Traversing list with enhanced for loop

		for (String name : nameList) {
			System.out.println("name: " + name);
		}
		
		//Traversing list with iterator
		
		Iterator<String> nameItr = nameList.iterator();
		
		while(nameItr.hasNext()) {
//			nameList.add("kiran"); this is not possible iterator fail fast
			String d = nameItr.next();
			System.out.println("Iterator data : "+d);
		}
		
		//Traversing list with listiterator- it can traverse both directions
		
				ListIterator<String> nameItr1 = nameList.listIterator();
				
				while(nameItr.hasNext()) {
					String d = nameItr1.next();
					System.out.println("Iterator data : "+d);
				}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListExample obj = new ListExample();
		
		obj.populateList();
		obj.displayList();
		obj.deleteElement(1);
		obj.displayList();

	}

}
