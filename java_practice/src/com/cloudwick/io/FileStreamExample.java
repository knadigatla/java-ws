package com.cloudwick.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {

	public void createFile(String filename) throws IOException {
		File f = new File(filename);
		
		if(f.exists()) {
			System.out.println("file already exists");
		}else {
			System.out.println("creating a new file");
			f.createNewFile();
		}
	}
	
	public void writeFile(String filename) throws IOException {

		File f = new File(filename);
		
		if(f.exists()){
			
//			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f)); // no buffering
			// 100 bytes buffering
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f),100);
			String s= "Kiran Nadigatla, Fremont, CA-90909";
			
			byte b[] = s.getBytes();
			bos.write(b);
			bos.flush();	//flushes all the data in buffer to file
			bos.close();
		}else
			System.out.println("there is no such file");

	}

	public void readFile(String filename) throws IOException {

		File f = new File(filename);
		if(f.exists() && f.length() > 0){
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(f),100);
			
			int b;
			
			while((b= in.read()) != -1)
				System.out.print((char)b);

			in.close();
			
		}

		

	}

	public static void main(String[] args) throws IOException, InvalidFundException {
		// TODO Auto-generated method stub
		FileStreamExample fse = new FileStreamExample();

		fse.createFile("sampleWrite1.txt");
		fse.writeFile("sampleWrite1.txt");
		fse.readFile("sampleWrite1.txt");
		
		
		int num = Integer.parseInt(args[0]);
		
		if(num<500) {
			InvalidFundException ife = new InvalidFundException("Sorry Insufficient funds !!");
			
//			ife.setUserName("kiran-123");
			
			throw ife;
		}

	}


}
