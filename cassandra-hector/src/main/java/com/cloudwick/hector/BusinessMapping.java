package com.cloudwick.hector;

public class BusinessMapping {

	String name;
	int id;
	String address;
	final String openYearCol = "open_year";
	int year;
	final String ratingCol = "rating";
	float rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getOpenYearCol() {
		return openYearCol;
	}
	public String getRatingCol() {
		return ratingCol;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+id+"\t"+address+"\t"+year+"\t"+rating;
	}
	
}
