package springboot.crudjdbcnamedparameters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.crudjdbcnamedparameters.entity.FetchEmployeeDeatilsDto;
import springboot.crudjdbcnamedparameters.entity.FetchEmployeeRequest;
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
	
	@PostMapping("/insertEmployeeList")
	public Boolean insertEmployeeRequestList(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestList) {
		return employeeService.insertEmployeeRequestList(insertEmployeeRequestList);
	}
	@PostMapping("/insertEmployeeRequestListUsingJdbcTemplate")
	public Boolean insertEmployeeRequestListUsingJdbcTemplate(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate) {
		return employeeService.insertEmployeeRequestListUsingJdbcTemplate(insertEmployeeRequestListUsingJdbcTemplate);
	}
	
	@GetMapping("/fetchAllDeatils")
	public List<InsertEmployeeRequest> fetchAllDeatils() {
		return employeeService.fetchAllDeatils();
	}
	
	@GetMapping("/fetchById/{emp_id}")
	public InsertEmployeeRequest fetchById(@PathVariable("emp_id") Long emp_id) {
		return employeeService.fetchById(emp_id);
	}
	@GetMapping("/fetchOneColomn")
	public List<InsertEmployeeRequest> fetchOneColomn() {
		return employeeService.fetchOneColomn();
		
	}
	
	@GetMapping("/fetchEmployeeNameByEmpIdUsingObject")
	public String fetchEmployeeNameByEmpIdUsingObject(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	}
	@GetMapping("/fetchEmployeeNameByEmpIdUsingMap")
	public FetchEmployeeDeatilsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	}
	@GetMapping("/fetchAllEmployeesUsingList")
	 public List<FetchEmployeeDeatilsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		 return employeeService.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	 }
	@GetMapping("/fetchEmployeeNameByEmpIdUsingQuery")		 
	public List<FetchEmployeeDeatilsDto> fetchEmployeeNameByEmpIdUsingQuery(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		return employeeService.fetchEmployeeNameByEmpIdUsingQuery(fetchEmployeeRequest);
	}
	
	@GetMapping("fetchAllEmployeeDetails")
	public List<FetchEmployeeDeatilsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		return employeeService.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}
			 			 
}
