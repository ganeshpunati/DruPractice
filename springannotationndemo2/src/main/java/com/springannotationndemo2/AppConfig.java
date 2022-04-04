package com.springannotationndemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("dept")
	public Department department() {
		Department department = new Department();
		department.setDepartmentId("D100");
		department.setDepartmentName("IT Department");
		return department;
	}
	@Bean("dept1")
	public Department department1() {
		Department department = new Department();
		department.setDepartmentId("D101");
		department.setDepartmentName("IT Department");
		return department;
	}
	@Bean("emp")
	public Employee employee() {
		Employee emp =new Employee();
		emp.setEmpId("E100");
		emp.setEmpName("Ganesh");
		return emp;
	}
}
