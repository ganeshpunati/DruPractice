package com.springbeanorderdemo1;

public class LatestTechBooks implements Books {
	private String bookName;
	private String author;
	@Override
	public void setbookName(String bookName) {
		this.bookName =bookName;
	}
	@Override
	public void setAuthor(String author) {
		this.author =author;	
	}
	@Override
	public String getBookName() {
		return bookName;
	}
	@Override
	public String getAuthor() {
		return author;	
	}
}
