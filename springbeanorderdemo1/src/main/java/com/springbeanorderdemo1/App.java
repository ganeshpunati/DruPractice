package com.springbeanorderdemo1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        BookExhibition bookexhibition =(BookExhibition)context.getBean("bookExhibition");
        List<Books> books =bookexhibition.getBooks();
        for(Books book : books) {
        	System.out.println(book.getBookName()+" "+book.getAuthor());
        }
    }
}
