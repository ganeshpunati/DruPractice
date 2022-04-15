package springboot.crudjdbctemplate1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.crudjdbctemplate1.entity.DeleteStudent;
import springboot.crudjdbctemplate1.entity.Student;
import springboot.crudjdbctemplate1.service.CrudJdbcService;

@RestController
@RequestMapping("/")
public class StudentController {
	@Autowired
	CrudJdbcService crudJdbcService;
	
	
	@PostMapping("/student")
	public Boolean add(@RequestBody Student student){
		 return crudJdbcService.add(student);	
	}
	@PutMapping("/student")
	public Boolean updateStudentData(@RequestBody Student student){
		return crudJdbcService.updateStudentData(student);
}
//	@DeleteMapping("/student/{emailId}")
//		public Boolean deleteStudentData(@PathVariable("emailId") String emailId){
//		return crudJdbcService.deleteStudentData(emailId);
//	}
	
	@DeleteMapping("/student")
	public Boolean deleteStudentData(@RequestBody DeleteStudent student) {
		return crudJdbcService.deleteStudentData(student);
	}
}
