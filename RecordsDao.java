package com.coderschool.records;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

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

	public void insertToStudents(Students student) {
		var inserted = jdbcClient.sql("insert into students values(?, ?, ?, ?, ?)")
				.params(List.of(student.getId(), student.getName(), student.getAge(), student.getLanguage(), student.getCoach()))
				.update();
		Assert.state(inserted == 1, "failed to POST into students error 27");
	}
	

}
	
