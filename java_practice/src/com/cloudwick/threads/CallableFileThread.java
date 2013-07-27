package com.cloudwick.threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Callable;

public class CallableFileThread implements Callable<Integer> {

	private File file;
	
	CallableFileThread(File filename) {
		this.file = filename;
	}
	
	@Override
	public Integer call() throws Exception {
		int count=0;

		if(file.exists() && file.length() > 0){
			BufferedReader br = new BufferedReader(new FileReader(file));

			try {
			
			String s = null;
			String[] sp = new String[5];
			
			while ((s=br.readLine()) != null) {
				sp = s.split(",");
				
				if(Integer.parseInt(sp[4]) > 30 && Integer.parseInt(sp[4])<40) {
					count++;
				}
			}
						
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				br.close();
			}
		}
		
		
		return count;
	}

}
