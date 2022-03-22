package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Languages {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Id
	private String id;
	private String languageName;
	private String languageDescription;
	@ManyToOne
	private Student student;
	
	
	public Languages(String id, String languageName, String languageDescription,String studentId) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageDescription = languageDescription;
		this.student = new Student(studentId,"","");
	}
	public Student getTopic() {
		return student;
	}
	public void setTopic(Student student) {
		this.student = student;
	}
	public Languages() {
		
	}
	public String getCourseName() {
		return languageName;
	}
	public void setCourseName(String languageName) {
		this.languageName = languageName;
	}
	public String getCourseDescription() {
		return languageDescription;
	}
	public void setCourseDescription(String languageDescription) {
		this.languageDescription = languageDescription;
	}
	
}