package com.cloudwick.project;

public class JavaProjManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Calculator obj = new Calculator(9,6);
		
		ScientificCal obj = new ScientificCal(10,11);
		int result = obj.calculate();
		System.out.println("result :"+result);
		
		result = obj.calculate("F");
		System.out.println("result :"+result);
		
		result = obj.calculate(10);
		System.out.println("result :"+result);
		
		System.out.println(obj);
		
		System.out.println(obj.checkMax());
		obj.hello();
		
//		ScientificCal nn = new Calculator();
//		Calculator mn = new ScientificCal(11, 11);
//		System.out.println(mn.calculate());
//		mn.
		
		Calculator obj1 = new Calculator(12,13);
		obj1.name = "kiran";
		
		Calculator obj2 = new Calculator(12,13);
		obj2.name = "kiran";
		
		System.out.println(obj1.equals(obj2));
		
		
	}

}
