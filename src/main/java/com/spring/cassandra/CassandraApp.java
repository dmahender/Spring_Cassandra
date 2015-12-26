package com.spring.cassandra;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;

public class CassandraApp {

	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CassandraApp.class);
	
	private static Cluster cluster;
	private static Session session;
	
	public static void main(String[] args) throws UnknownHostException {
		
		cluster=Cluster.builder().addContactPoints("127.0.0.1").build();
session = cluster.connect("demo");

CassandraOperations cassandraOps  = new CassandraTemplate(session);


cassandraOps.insert(new Users("1646","avis",50,"detroit","mahi@majo.com","maki"));

Select s = QueryBuilder.select().from("users");
s.where(QueryBuilder.eq("id", "1646"));

LOG.info(cassandraOps.queryForObject(s, Users.class).getId());

cassandraOps.truncate("users");
		
		
		
	}

}
