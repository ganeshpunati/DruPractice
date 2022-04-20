package springboot.crudjdbcnamedparameters.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.crudjdbcnamedparameters.dao.EmployeeDao;
import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;
@Service
public class EmployeeserviceImpl implements EmployeeService {
	@Autowired
	EmployeeDao service ;
	
	@Override
	public Boolean insertEmployeeDetails(InsertEmployeeRequest insertEmployeeRequest) {
		return service.insertEmployeeDetails(insertEmployeeRequest);
		
	}

}
