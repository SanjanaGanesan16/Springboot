package com.coderschool.records;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private Long id;
	private String name;
	private int age;
	private String language;
	private String coach;
	
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getLanguage() {
		return this.language;
	}
	public String getCoach() {
		return this.coach;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	
}
