package springboot.crudjdbcnamedparameters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;
import springboot.crudjdbcnamedparameters.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/insertEmployeeRequest")
	public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest) {
		return employeeService.insertEmployeeDetails(insertEmployeeRequest);
	}
}
