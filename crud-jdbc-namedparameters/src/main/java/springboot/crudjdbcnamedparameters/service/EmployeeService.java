package springboot.crudjdbcnamedparameters.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import springboot.crudjdbcnamedparameters.entity.FetchEmployeeDeatilsDto;
import springboot.crudjdbcnamedparameters.entity.FetchEmployeeRequest;
import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;
@Service
public interface EmployeeService {
	
  public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest);
  public Boolean insertEmployeeRequestList(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestList);
  public Boolean insertEmployeeRequestListUsingJdbcTemplate(@RequestBody List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate);
  public List<InsertEmployeeRequest> fetchAllDeatils();
  public InsertEmployeeRequest fetchById( Long emp_id);
  public List<InsertEmployeeRequest> fetchOneColomn();
  public String fetchEmployeeNameByEmpIdUsingObject(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
  
  public FetchEmployeeDeatilsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
  
  public List<FetchEmployeeDeatilsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
  public List<FetchEmployeeDeatilsDto> fetchEmployeeNameByEmpIdUsingQuery(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
  public List<FetchEmployeeDeatilsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeRequest fetchEmployeeRequest);
}
