package com.springbeanscopesdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp = (Employee)context.getBean("employee");
        System.out.println(emp);
        Employee emp1 = (Employee)context.getBean("employee");
        System.out.println(emp1);
        Employee emp2 = (Employee)context.getBean("employee1");
        System.out.println(emp2);
        Employee emp3 = (Employee)context.getBean("employee1");
        System.out.println(emp3);
    }
}






