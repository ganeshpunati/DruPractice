package com.springcoreautowiring1;

import java.util.List;

public class NewOrganization {
	
	public NewOrganization(List<NewDepartment> departments) {
		System.out.println("in newOrganization list");
	}
  
    public NewOrganization(NewDepartment newDepartment) {
    	System.out.println("in newOrganization new Department");
	}
    public NewOrganization(AdvancedDepartment advancedDepartment) {
    	System.out.println("in newOrganization new AdvancedDepartment");
	}

}
