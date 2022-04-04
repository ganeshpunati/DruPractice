package com.springannotationdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp =(Employee)context.getBean("employee");
        System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getDepartment().getDepartmentId()+" "+emp.getDepartment().getDepartmentName());
    }
}
