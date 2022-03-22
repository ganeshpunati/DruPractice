package com.example.demo;

public class Language {

	private String name;
	private int numberOfPeople;
	Language(){	
	}
	public Language(String name, int numberOfPeople) {
		super();
		this.name = name;
		this.numberOfPeople = numberOfPeople;
	}

	public String getName() {
		return name;
	}
	public void setName(String region) {
		this.name = region;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}	
}