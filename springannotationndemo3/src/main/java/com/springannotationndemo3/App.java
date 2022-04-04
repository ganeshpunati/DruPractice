package com.springannotationndemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
      Department department =(Department)context.getBean("dept");
      department.setDepartmentId("D101");
      department.setDepartmentName("EEE");
      Employee employee=(Employee)context.getBean("employee");
      employee.setEmployeeId("E101");
      employee.setEmployeeName("Ganesh");
      System.out.println(department.getDepartmentId()+"\n"+department.getDepartmentName()+"\n"+employee.getEmployeeId()+"\n"+employee.getEmployeeName()+"\n"+employee.getDepartment().getDepartmentId());
    }
}
