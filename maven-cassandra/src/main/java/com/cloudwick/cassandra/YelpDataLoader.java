package com.cloudwick.cassandra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.datastax.driver.core.Session;

public class YelpDataLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleClient sc = new SimpleClient();
		sc.connect("192.168.1.239");
		Session session = sc.createSession();
		/*table creation 
		session.execute("CREATE KEYSPACE yelp WITH replication "
				+ "= {'class':'SimpleStrategy', 'replication_factor':1};");
		session.execute("CREATE TABLE yelp.business (" + "type text,"
				+ "business_id text," + "name text PRIMARY KEY," + "neighborhoods list<text>,"
				+ "full_address text," + "city text," + "state text,"
				+ "latitude double," + "longitude double," + "stars double,"
				+ "review_count bigint," + "categories list<text>," +"open boolean"+ ");");
		*/
		JSONParser parser = new JSONParser();

		try {
			String s;
			int c=0;
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\Kiran\\Desktop\\cassandra\\yelp_phoenix_academic_dataset\\yelp_academic_dataset_business.json"));

			while ((s = br.readLine()) != null) {
				Object obj = parser.parse(s);
//			Object obj = parser.parse(br.readLine());

				JSONObject jsonObject = (JSONObject) obj;

				/*System.out.println(jsonObject.get("type").getClass());
				System.out.println(jsonObject.get("business_id").getClass());
				System.out.println(jsonObject.get("name").getClass());
				System.out.println(jsonObject.get("neighborhoods").getClass());
				System.out.println(jsonObject.get("full_address").getClass());
				System.out.println(jsonObject.get("city").getClass());
				System.out.println(jsonObject.get("state").getClass());
				System.out.println(jsonObject.get("latitude").getClass());
				System.out.println(jsonObject.get("longitude").getClass());
				System.out.println(jsonObject.get("stars").getClass());
				System.out.println(jsonObject.get("review_count").getClass());
				System.out.println(jsonObject.get("categories").getClass());
				System.out.println(jsonObject.get("open").getClass());
				*/
				StringBuffer sb = new StringBuffer();
				
				sb.append("INSERT INTO yelp.business (type, business_id, name, neighborhoods, full_address, ");
				sb.append("city, state, latitude, longitude, stars, review_count, categories, open) ");
				sb.append("VALUES (");
				sb.append("'"+jsonObject.get("type").toString().replace("'", "''")+"', ");
				sb.append("'"+jsonObject.get("business_id").toString().replace("'", "''")+"', ");
				sb.append("'"+jsonObject.get("name").toString().replace("'", "''")+"', ");
				
				JSONArray nbr = (JSONArray) jsonObject.get("neighborhoods");
//				Iterator<String> iterator = nbr.iterator();
//				while (iterator.hasNext()) {
//					sb.append("'"+iterator.next()+"', ");
//				}
				String nbrhds = nbr.toString().replaceAll("\"", "'");
				sb.append(nbrhds.replace("'", "''")+", ");
				sb.append("'"+jsonObject.get("full_address").toString().replace("'", "''")+"', ");
				sb.append("'"+jsonObject.get("city").toString().replace("'", "''")+"', ");
				sb.append("'"+jsonObject.get("state").toString()+"', ");
				sb.append((Double)jsonObject.get("latitude")+", ");
				sb.append((Double)jsonObject.get("longitude")+", ");
				sb.append((Double)jsonObject.get("stars")+", ");
				sb.append((Long)jsonObject.get("review_count")+", ");

				JSONArray ctr = (JSONArray) jsonObject.get("categories");
//				Iterator<String> itr = ctr.iterator();
//				while (itr.hasNext()) {
//					sb.append("'"+itr.next()+"', ");
//				}
				String ctgrs = ctr.toString().replace("'", "''").replaceAll("\"", "'");
				sb.append(ctgrs+", ");
				
				sb.append((Boolean)jsonObject.get("open")+");");
				
				System.out.println(sb.toString());
				session.execute(sb.toString());
				System.out.println("the number of rows inserted - "+c++);

		}
			sc.close();

			System.out.println("done!!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
