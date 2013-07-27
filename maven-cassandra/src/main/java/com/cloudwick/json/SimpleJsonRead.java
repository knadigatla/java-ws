package com.cloudwick.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SimpleJsonRead {
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();

		try {
			String s;
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kiran\\Desktop\\abc.json"));
			
			while ((s=br.readLine()) != null)
			{
				System.out.println(s);
			Object obj = parser.parse(s);
			

			JSONObject jsonObject = (JSONObject) obj;

			String name = (String) jsonObject.get("name");
			System.out.println(name);

			long age = (Long) jsonObject.get("age");
			System.out.println(age);

			// loop array
			JSONArray msg = (JSONArray) jsonObject.get("messages");
//			Iterator<String> iterator = msg.iterator();
//			while (iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
			System.out.println(msg.toString().replaceAll("\"", "'").replace('[', '{').replace(']', '}'));
			
			
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}