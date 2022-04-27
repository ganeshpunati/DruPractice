package springboot.crudjdbcnamedparameters.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import springboot.crudjdbcnamedparameters.entity.FetchEmployeeDeatilsDto;
import springboot.crudjdbcnamedparameters.entity.FetchEmployeeRequest;
import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;

public interface EmployeeDao {
	public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest);
	
	public Boolean insertEmployeeRequestList(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestList);
	public Boolean insertEmployeeRequestListUsingJdbcTemplate(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate);
	 public List<InsertEmployeeRequest> fetchAllDeatils();
	 
	 public InsertEmployeeRequest fetchById( Long emp_id);
	 public List<InsertEmployeeRequest> fetchOneColomn();
	 public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest);
	 public FetchEmployeeDeatilsDto fetchEmployeeNameByEmpIdUsingMap( FetchEmployeeRequest fetchEmployeeRequest);
	 public List<FetchEmployeeDeatilsDto> fetchAllEmployeesUsingList( FetchEmployeeRequest fetchEmployeeRequest);
	 public List<FetchEmployeeDeatilsDto> fetchEmployeeNameByEmpIdUsingQuery( FetchEmployeeRequest fetchEmployeeRequest);

	public List<FetchEmployeeDeatilsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
}
