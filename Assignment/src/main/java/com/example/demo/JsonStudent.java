package com.example.demo;
import org.springframework.data.annotation.Id;
//@Entity
public class JsonStudent {

	
	public int userId;
	@Id
	public int id;
	public String title;
	public boolean completed;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public JsonStudent() {
	
	}
	public JsonStudent(int userId, int id, String title, boolean completed) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
//	public JsonTopic(int userId2, int id2, String title2, boolean completed2) {
//		// TODO Auto-generated constructor stub
//	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
}