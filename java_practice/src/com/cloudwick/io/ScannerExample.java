package com.cloudwick.io;

import java.util.Scanner;

public class ScannerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String name = scnr.nextLine();
		
		System.out.println("Hello "+name+" ! enter age");
		int age = scnr.nextInt();
		
		System.out.println("your age is "+age);

	}

}
