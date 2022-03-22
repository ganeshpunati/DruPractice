package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Languages;
import com.example.demo.Student;
import com.example.demo.service.LanguagesService;
@RestController
public class LanguagesController {
	@Autowired
	LanguagesService languagesService;
	
	@RequestMapping("/students/{id}/languages")
	public List<Languages> getAllTheCourses(@PathVariable String id) {
		return languagesService.getAllLanguages(id);
	}
	@RequestMapping("/students/{id}/languages/{languageId}")
	public Languages getLanguages(@PathVariable String languageId) {
		return languagesService.getLanguages(languageId);
	}
	//REq mapping -> to map
	//specify method, bcoz get is default
	//value -
	@RequestMapping(method = RequestMethod.POST, value = "/students/{studentId}/languages")
	public void addLanguages(@RequestBody Languages language, @PathVariable String  studentId) {//pick instance from req body 
		language.setTopic(new Student(studentId,"",""));
		languagesService.addLanguages(language);   // calling service method for business logic 
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{studentId}/languages/{languageId}")
	public void updateLanguages(@RequestBody Languages language,@PathVariable String studentId, @PathVariable String languageId) {
		language.setTopic(new Student(studentId,"",""));
		languagesService.updateLanguages(language);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{studentId}/languages/{languageId}")
	public void deleteLanguages(@PathVariable String languageId) {
		languagesService.deleteLanguages(languageId);
	}	
}