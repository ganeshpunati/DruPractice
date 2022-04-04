package com.springannotationdemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Department department() {
		Department department = new Department();
		department.setDepartmentId("D101");
		department.setDepartmentName("IT Department");
		return department;
	}
	@Bean
	public Employee employee() {
		Employee emp =new Employee();
		Department department = department();
		emp.setEmpId("E100");
		emp.setEmpName("Ganesh");
		emp.setDepartment(department);
		return emp;
	}
}
