package com.coderschool.records;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RecordsController {
	
	private final RecordsService recordsservice;
	
	@Autowired
	public RecordsController(RecordsService recordsservice) {
		this.recordsservice = recordsservice;
	}
	
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("students")
	public List<Students> getStudents(){
		return recordsservice.getRecords();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("student")
	void insertToStudents(@RequestBody Students student) {
		this.recordsservice.insertToStudents(student);
		
	}
}
