package com.cloudwick.collections;

public class User implements Comparable<User>{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		
		int age2 = u.getAge();
		return this.age - age2;
	}
	
	

}
