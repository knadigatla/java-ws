package com.cloudwick.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class SimpleClient {

	private Cluster cluster;
	private Session session;

	public void connect(String node) {
		cluster = Cluster.builder().addContactPoint(node).build();
		Metadata metadata = cluster.getMetadata();
		System.out.printf("Connected to cluster: %s\n",
				metadata.getClusterName());
		for (Host host : metadata.getAllHosts()) {
			System.out.printf("Datacenter: %s; Host: %s; Rack: %s\n",
					host.getDatacenter(), host.getAddress(), host.getRack());
		}
	}

	public void close() {
		cluster.shutdown();
	}
	
	public Session createSession() {
		if(session == null)
			return cluster.connect();
		else
			return session;
	}

//	public static void main(String[] args) {
//		SimpleClient client = new SimpleClient();
//		client.connect("192.168.1.239");
//		client.close();
//	}
}
