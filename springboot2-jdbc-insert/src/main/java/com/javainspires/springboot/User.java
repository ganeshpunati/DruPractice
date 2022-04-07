package com.javainspires.springboot;

import java.util.Date;

public class User {
	private String userName;
	private String email;
	private String password;
	private Date create_time;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public User(String userName, String email, String password, Date create_time) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.create_time = create_time;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
