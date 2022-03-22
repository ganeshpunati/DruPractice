package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Id
	private String id;
	private String studentName;
	private String studentDescription;
	public Student(String id, String studentName, String studentDescription) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentDescription = studentDescription;
	}
	public Student() {
		
	}
	public String getName() {
		return studentName;
	}
	public void setName(String studentName) {
		this.studentName = studentName;
	}
	public String getDescription() {
		return studentDescription;
	}
	public void setDescription(String studentDescription) {
		this.studentDescription = studentDescription;
	}
}