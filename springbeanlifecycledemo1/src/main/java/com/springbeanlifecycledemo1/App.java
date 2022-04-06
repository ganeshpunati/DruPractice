package com.springbeanlifecycledemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
         Employee emp =(Employee)context.getBean("employee");
         System.out.println("bean is in process");
    	context.close();
    }
}
