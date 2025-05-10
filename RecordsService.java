package com.coderschool.records;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordsService {
	@Autowired
	RecordsDao recordsdao;
	
	public List<Students> getRecords(){
		return recordsdao.findAll();
	}

	public void insertToStudents(Students student) {
		this.recordsdao.insertToStudents(student);
	}
	

}
