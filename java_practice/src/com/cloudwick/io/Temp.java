package com.cloudwick.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Temp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("kiran.txt");
		
		String k="aslkdjfhalkjsdhf";
		
		fos.write(k.getBytes());
		
		fos.flush();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("kiran.txt");
		byte b;
		while(fis.available()>0) {
			System.out.print((char)(fis.read()));
			
		}
		
		fis.close();
		
		
	}

}
