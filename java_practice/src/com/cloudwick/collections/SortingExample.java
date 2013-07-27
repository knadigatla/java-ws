package com.cloudwick.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
	
	private List<String> cityList;
	
	private void sort(){
		cityList = new ArrayList<String>();
		cityList.add("Hayward");
		cityList.add("Fremont");

		cityList.add("hello");
		Collections.sort(cityList);
		
		for(String a:cityList) {
			System.out.println(a);
		}
	}
	
	private void customSorting() {
		User u = new User();
		u.setAge(21);
		u.setName("Keith");
		User u1 = new User();
		u1.setAge(24);
		u1.setName("Albie");
		User u2 = new User();
		u2.setAge(23);
		u2.setName("Jenny");
		User u3 = new User();
		u3.setAge(19);
		u3.setName("Ram");
		
		List<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u);
		
		Collections.sort(userList);
		
		for(User us:userList) {
			System.out.println(us.getAge());
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortingExample se = new SortingExample();
		se.sort();
		se.customSorting();
	}

}
