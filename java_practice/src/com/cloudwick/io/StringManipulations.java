package com.cloudwick.io;

import java.util.StringTokenizer;

public class StringManipulations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuilder sb = new StringBuilder(); //multi threaded Mutable class
		sb.append("Kiran");
		sb.append(" Nadigatla");
		
		String k = "Rajesh Kuthrapali";
		 String l = "abcd".intern();
		 String temp = "I,Kiran,Nadigatla,Lives,In,Fremont,Calif";
		 
		 StringTokenizer st = new StringTokenizer(temp, ",");
		 
		 for(String ll: temp.split(",")){
			 System.out.println(ll);
		 }
		 
		 System.out.println(l);
		
		System.out.println(sb);

	}

}
