package com.cloudwick.project;

public class Calculator extends CalAbstract {

	public int num1;
	public int num2;
	public String name;

	public Calculator() {
		
	}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int calculate() {
		return this.num1+this.num2;
	}
	
	public String toString() {
		return this.num1+" : "+this.num2;
	}
	
	public int calculate(String id) {
		return this.num1-this.num2;
	}
	
	public int calculate(int id) {
		return this.num1*this.num2;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("in Hello");
	}
	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		else if(!(o instanceof Calculator))
			return false;
		
		Calculator obj = (Calculator) o;
		
		return (this.name == obj.name && this.num1 == obj.num1
				&& this.num2 == obj.num2);
	}
	
	public int hashcode() {
		int hash = 7;
		hash = (hash*30) + (this.name == null ? 0:this.name.hashCode());
		hash = (hash*30) + num1;
		hash = (hash*30) + num2;
		
		return hash;

	}

}
