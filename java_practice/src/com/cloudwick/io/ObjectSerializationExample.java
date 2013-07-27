package com.cloudwick.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializationExample {

	private void serializeObject(String filename) throws IOException {

		User obj = new User();
		obj.setName("Kiran");
		obj.setCity("Fremont");
		obj.setAge(24);
		obj.setSsn(123123112);
		
		ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(filename));
		
		oos.writeObject(obj);
//		obj.setCity("Richmond");
//		oos.reset();
//
//		oos.writeObject(obj);

		oos.flush();
		oos.close();
		
	}

	private void deserializeObject(String filename) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
		
		Object obj = ois.readObject();
		
		
		if(obj instanceof User) {
			User obj1 = (User)obj;
			
			System.out.println("name : "+obj1.getName()
					+"\ncity : "+obj1.getCity()
					+"\nage :"+obj1.getAge()
					+"\nssn :"+obj1.getSsn());
		}
		ois.close();
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectSerializationExample ose = new ObjectSerializationExample();
		
		ose.serializeObject("objectFile.txt");
		ose.deserializeObject("objectFile.txt");
		
		
	}

}
