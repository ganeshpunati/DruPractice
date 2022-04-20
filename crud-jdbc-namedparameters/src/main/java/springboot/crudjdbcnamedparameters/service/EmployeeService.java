package springboot.crudjdbcnamedparameters.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;
@Service
public interface EmployeeService {
	
  public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest);
  
}
