package com.springannotationndemo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

	@Bean("department")	
	public Department department() {
		Department dept =new Department();
		dept.setDeptId("D100");
		dept.setDeptName("IT");
		return dept;
	}
	@Bean("department")
	@Primary
	public Department department1() {
		Department dept =new Department();
		dept.setDeptId("D101");
		dept.setDeptName("EEE");
		return dept;
	}
	@Bean
	public Employee employee() {
		Employee emp =new Employee();
		emp.setEmpId("E101");
		emp.setEmpName("Ganesh");
		return emp;
	}
}
