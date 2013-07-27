package com.cloudwick.cassandra;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class CqlOps {

	private Session session;

	public void createSchema() {
		session.execute("CREATE KEYSPACE simplex WITH replication "
				+ "= {'class':'SimpleStrategy', 'replication_factor':1};");
		session.execute("CREATE TABLE simplex.songs (" + "id uuid PRIMARY KEY,"
				+ "title text," + "album text," + "artist text,"
				+ "tags set<text>," + "data blob" + ");");
		session.execute("CREATE TABLE simplex.playlists (" + "id uuid,"
				+ "title text," + "album text, " + "artist text,"
				+ "song_id uuid," + "PRIMARY KEY (id, title, album, artist)"
				+ ");");
	}

	public void loadData() {
		session.execute("INSERT INTO simplex.songs (id, title, album, artist, tags) "
				+ "VALUES ("
				+ "756716f7-2e54-4715-9f00-91dcbea6cf50,"
				+ "'La Petite Tonkinoise',"
				+ "'Bye Bye Blackbird',"
				+ "'Joséphine Baker'," + "{'jazz', '2013'})" + ";");
		session.execute("INSERT INTO simplex.playlists (id, song_id, title, album, artist) "
				+ "VALUES ("
				+ "2cc9ccb7-6221-4ccb-8387-f22b6a1b354d,"
				+ "756716f7-2e54-4715-9f00-91dcbea6cf50,"
				+ "'La Petite Tonkinoise',"
				+ "'Bye Bye Blackbird',"
				+ "'Joséphine Baker'" + ");");
	}

	public void querySchema() {
		ResultSet results = session.execute("SELECT * FROM simplex.playlists "
				+ "WHERE id = 2cc9ccb7-6221-4ccb-8387-f22b6a1b354d;");

		System.out
				.println(String
						.format("%-30s\t%-20s\t%-20s\n%s", "title", "album",
								"artist",
								"-------------------------------+-----------------------+--------------------"));
		for (Row row : results) {
			System.out.println(String.format("%-30s\t%-20s\t%-20s",
					row.getString("title"), row.getString("album"),
					row.getString("artist")));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SimpleClient sc = new SimpleClient();
		CqlOps co = new CqlOps();
		sc.connect("192.168.1.239");
		co.session = sc.createSession();
//		co.createSchema();
//		co.loadData();
		co.querySchema();
		sc.close();

	}

}
