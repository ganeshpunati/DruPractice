package springboot.crudjdbctemplate1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import springboot.crudjdbctemplate1.entity.DeleteStudent;
import springboot.crudjdbctemplate1.entity.Student;
@Service
public interface CrudJdbcService {

	public Boolean add(@RequestBody Student student);

	public Boolean updateStudentData(@RequestBody Student student);

//	public Boolean deleteStudentData(@PathVariable("emailId") String emailId);
	public Boolean deleteStudentData(@RequestBody DeleteStudent student);
}

