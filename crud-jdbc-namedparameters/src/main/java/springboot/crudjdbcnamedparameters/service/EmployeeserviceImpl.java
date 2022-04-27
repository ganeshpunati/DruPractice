package springboot.crudjdbcnamedparameters.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import springboot.crudjdbcnamedparameters.dao.EmployeeDao;
import springboot.crudjdbcnamedparameters.entity.FetchEmployeeDeatilsDto;
import springboot.crudjdbcnamedparameters.entity.FetchEmployeeRequest;
import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;
@Service
public class EmployeeserviceImpl implements EmployeeService {
	@Autowired
	EmployeeDao service ;
	
	@Override
	public Boolean insertEmployeeDetails(InsertEmployeeRequest insertEmployeeRequest) {
		return service.insertEmployeeDetails(insertEmployeeRequest);
		
	}
	@Override
	 public Boolean insertEmployeeRequestList( List<InsertEmployeeRequest> insertEmployeeRequestList) {
		 return service.insertEmployeeRequestList(insertEmployeeRequestList);
	 }
	@Override
	 public Boolean insertEmployeeRequestListUsingJdbcTemplate( List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate) {
		 return service.insertEmployeeRequestListUsingJdbcTemplate(insertEmployeeRequestListUsingJdbcTemplate);
	 }
	@Override
	public List<InsertEmployeeRequest> fetchAllDeatils() {
		return service.fetchAllDeatils();
	}
	@Override
	 public InsertEmployeeRequest fetchById(Long emp_id) {
	 return service.fetchById(emp_id);
	 }
	@Override
	 public List<InsertEmployeeRequest> fetchOneColomn() {
		 return service.fetchOneColomn();
	 }
	@Override
	 public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	 }
	@Override
	 public FetchEmployeeDeatilsDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	 }
	@Override
	 public List<FetchEmployeeDeatilsDto> fetchAllEmployeesUsingList(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		 return service.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	 }
	@Override
	 public List<FetchEmployeeDeatilsDto> fetchEmployeeNameByEmpIdUsingQuery(@RequestBody FetchEmployeeRequest fetchEmployeeRequest){
		 return service.fetchEmployeeNameByEmpIdUsingQuery(fetchEmployeeRequest);
	 }
	@Override
	public List<FetchEmployeeDeatilsDto> fetchAllEmployeeDetails(@RequestBody FetchEmployeeRequest fetchEmployeeRequest) {
		return service.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}

}
