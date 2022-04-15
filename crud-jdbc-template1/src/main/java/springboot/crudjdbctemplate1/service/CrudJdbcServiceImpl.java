package springboot.crudjdbctemplate1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import springboot.crudjdbctemplate1.dao.StudentRepository2;
import springboot.crudjdbctemplate1.dao.StudentRepository3;
import springboot.crudjdbctemplate1.entity.DeleteStudent;
import springboot.crudjdbctemplate1.entity.Student;

@Service
public class CrudJdbcServiceImpl implements CrudJdbcService {
	
	@Autowired
	StudentRepository3 service;
	
	public Boolean add(@RequestBody Student student) {
		 return service.add(student);
	}
	public Boolean updateStudentData(@RequestBody Student student) {
		
		return service.updateStudentData(student);
	}
//	public Boolean deleteStudentData(@PathVariable("emailId") String emailId) {
//		
//		return service.deleteStudentData(emailId);
//	}
public Boolean deleteStudentData(@RequestBody DeleteStudent student) {
		
		return service.deleteStudentData(student);
	}

}
