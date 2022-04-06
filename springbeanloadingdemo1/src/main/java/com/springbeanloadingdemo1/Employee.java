package com.springbeanloadingdemo1;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	public Employee() {
		System.out.println("employee object constructor");
	}
	private String empId;
	private String empName;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
