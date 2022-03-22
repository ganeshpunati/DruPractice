package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student;
import com.example.demo.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllTheStudents() {
		System.out.println("**************************************");
		return studentService.getAllStudent();
	}
	@RequestMapping("/"
			+ ""
			+ ""
			+ ""
			+ "/{id}")
	public Student getStudent(@PathVariable String id) {
		return studentService.getStudent(id);
	}

	
	//REq mapping -> to map
	//specify method, bcoz get is default
	//value -
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {//pick instance from req body 
		studentService.addStudent(student);   // calling service method for business logic 
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable String id) {
		studentService.updateStudent(id,student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
