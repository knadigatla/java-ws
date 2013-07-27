package com.cloudwick.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {

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
			BufferedWriter bw = new BufferedWriter(new FileWriter(f),100);
			String s= "Kiran Nadigatla, Fremont, CA-90909\n";
			
			bw.write(s);
			s= "second line \n";
			bw.write(s);
			s= "third line \n";
			bw.write(s);
	
			bw.flush();	//flushes all the data in buffer to file
			bw.close();
		}else
			System.out.println("there is no such file");

	}

	public void readFile(String filename) throws IOException {

		File f = new File(filename);
		if(f.exists() && f.length() > 0){
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String s = null;
			while ((s=br.readLine()) != null)
				System.out.println(s);
				
			br.close();
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReaderExample fre = new FileReaderExample();

		fre.createFile("sampleWrite2.txt");
		fre.writeFile("sampleWrite2.txt");
		fre.readFile("sampleWrite2.txt");

	}

}
