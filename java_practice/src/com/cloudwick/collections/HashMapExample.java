package com.cloudwick.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	
	private Map<Integer,String> nameMap;

	private void populateMap() {

		nameMap = new HashMap<Integer,String>();
		
		nameMap.put(1, "Fremont");
		nameMap.put(2, "Fremohgf");
		nameMap.put(4, "Fremod988");
		nameMap.put(4, "Sanjose");
		nameMap.put(5, "Calif");
		
		
	}

	private void displayMapByvalue() {

		Collection<String> nval = nameMap.values();
		Iterator<String> itr = nval.iterator();
		while(itr.hasNext()) {
			System.out.println("the conent: "+itr.next());
		}
	}

	private void displayMapByKey() {

		Set<Integer> nkeys = nameMap.keySet();
		Iterator<Integer> itr = nkeys.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println("Key : "+key);
			System.out.println("Value : "+nameMap.get(key) );
		}
		
	}

	private void diplayMapByEntry() {

		Set<Entry<Integer,String>> nent = nameMap.entrySet();
		
		Iterator<Entry<Integer,String>> itr = nent.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,String> ent = itr.next();
			System.out.println("Key : "+ent.getKey());
			System.out.println("Value : "+ent.getValue());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMapExample he = new HashMapExample();
		he.populateMap();
		he.displayMapByvalue();
		he.displayMapByKey();
		he.diplayMapByEntry();
	}

}
