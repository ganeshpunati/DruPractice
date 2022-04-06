package com.springbeanorderdemo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BookExhibition {	
	@Autowired
	private List<Books> books;
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}	
}
