package com.cloudwick.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeStreamExample {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PipedOutputStream pos = new PipedOutputStream();
		
		PipedInputStream pis = new PipedInputStream();
		
		pis.connect(pos);

		pos.write(36);
		pos.write(45);
		pos.write(23);
		
		for(int i=0; i<3; i++) {
			System.out.println( pis.read());
		}
		pis.close();
		
	}

}
