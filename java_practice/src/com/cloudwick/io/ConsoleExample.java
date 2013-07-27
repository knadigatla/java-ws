package com.cloudwick.io;

import java.io.Console;
import java.util.Scanner;

public class ConsoleExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c = System.console();
		
		if(c != null) {
			System.out.println("Please enter name:");
			Scanner s = new Scanner(c.reader());
			
			while(s.hasNext()) {
				String name = s.next();
				System.out.println(name);
			}
		}
	}

}
