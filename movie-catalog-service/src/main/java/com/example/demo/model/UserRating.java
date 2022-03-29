package com.example.demo.model;

import java.util.List;

public class UserRating {

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	public UserRating() {	
	}
	private List<Rating> userRating;
}