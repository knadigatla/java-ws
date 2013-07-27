package com.cloudwick.io;

import java.io.Serializable;

public class User implements Serializable{
	

	private static final long serialVersionUID = -5678112230197165252L;
	
	private String name;
	private String city;
	private int age;
	private transient int ssn;		//transient will stop sending the secured data by stream

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
