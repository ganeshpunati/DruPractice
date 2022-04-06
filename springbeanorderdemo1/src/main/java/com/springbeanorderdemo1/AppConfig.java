package com.springbeanorderdemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {
	@Bean
	public BookExhibition bookExhibition() {
		return new BookExhibition();
	}
	@Bean
	public Books latestTechBooks() {
		Books latestTechBooks=new LatestTechBooks();
		latestTechBooks.setAuthor("Anu");
		latestTechBooks.setbookName("Python");
		return latestTechBooks;
	}
	@Bean
	public Books oldTeckbooks() {
		Books oldTeckbooks =new OldTeckbooks();
		oldTeckbooks.setAuthor("Ganesh");
		oldTeckbooks.setbookName("Java");
		return oldTeckbooks;
	}
}
