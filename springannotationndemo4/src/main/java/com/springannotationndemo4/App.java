package com.springannotationndemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context =new AnnotationConfigApplicationContext(Config.class);
//       Department department =(Department)context.getBean("department");
//       
//       String deptId = department.getDeptId();
//       String deptName =department.getDeptName();
       
       Employee employee =(Employee)context.getBean("employee");
       String empId =employee.getEmpId();
       String empName =employee.getEmpName();
       Department dept =employee.getDepartment();
       String deptId1 =dept.getDeptId();
       String deptName1 =dept.getDeptName();
       System.out.println(empId+"\n"+empName+"\n"+deptId1+"\n"+deptName1);
       
       
    }
}
