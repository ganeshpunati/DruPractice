package springboot.crudjdbcnamedparameters.dao;

import org.springframework.web.bind.annotation.RequestBody;

import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;

public interface EmployeeDao {
	public Boolean insertEmployeeDetails(@RequestBody InsertEmployeeRequest insertEmployeeRequest);
}
