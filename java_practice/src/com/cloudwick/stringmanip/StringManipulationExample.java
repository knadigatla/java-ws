package com.cloudwick.stringmanip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class StringManipulationExample {

	public void analyseData(String filename) {
		File f = new File(filename);
		if(f.exists() && f.length() > 0){
			try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			BufferedWriter bw = new BufferedWriter(new FileWriter("filteredusers.txt"));
			
			String s = null;
			String[] sp = new String[5];
			
			while ((s=br.readLine()) != null) {
//				StringTokenizer st = new StringTokenizer(s,",");
				StringBuilder sbout = new StringBuilder();
				sp = s.split(",");
				
				if(Integer.parseInt(sp[4]) > 30 && Integer.parseInt(sp[4])<40) {
					sbout.append(sp[0]);
					sbout.append(',');
					sbout.append(sp[1]);
					sbout.append(',');
					sbout.append(sp[4]);
					sbout.append("\n");
					bw.write(sbout.toString());
					

				}
			}
			
			br.close();
			bw.close();
			
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				
			}
		}
		
	}
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringManipulationExample sme = new StringManipulationExample();
		sme.analyseData("users.txt");
		
	}

}
