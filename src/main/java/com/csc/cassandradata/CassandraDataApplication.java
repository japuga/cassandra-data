package com.csc.cassandradata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories
public class CassandraDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraDataApplication.class, args);
	}


/*	@Bean
	public Session getSession(){
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").withPort(9042).build();
		return cluster.connect("jp_keyspace");

	}*/
}
