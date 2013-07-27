package com.cloudwick.project;

public class ScientificCal extends Calculator implements CalI {

	public ScientificCal(int n1,int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public int calculate() {
		return this.num1-this.num2;
	}
	public void xyz() {
		System.out.println("in the xyz");
	}

	@Override
	public boolean checkMax() {

		if(this.num1 > this.num2)
			return true;
		else
			return false;
	}
}
