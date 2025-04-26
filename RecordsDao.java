package com.coderschool.records;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecordsDao {
	private final JdbcClient jdbcClient;
	
	public RecordsDao(JdbcClient jdbcClient) {
		this.jdbcClient = jdbcClient;
	}
	
	public List<Students> findAll(){
		return jdbcClient.sql("select * from students").query(Students.class).list();
	}
	

}
	
