package com.springannotationndemo3;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
	private String departmentId;
	private String departmentName;
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
