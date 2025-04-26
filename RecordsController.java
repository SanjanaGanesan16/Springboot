package com.coderschool.records;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
