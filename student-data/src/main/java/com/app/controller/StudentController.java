package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.ResponseData;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
     
	@Autowired
	StudentService studentService;
	
	@GetMapping("/{studentId}")
	public ResponseEntity<ResponseData> getStudent(@PathVariable("studentId") Long studentId){
		return studentService.getStudent(studentId);
	}
}
