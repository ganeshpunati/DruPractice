package com.springbeanloadingdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
      System.out.println("Application context is created ");
     Employee emp =(Employee)context.getBean("employee");
     Employee emp1 =(Employee)context.getBean("employee");
     System.out.println(emp);
     System.out.println(emp1);
    }
}
