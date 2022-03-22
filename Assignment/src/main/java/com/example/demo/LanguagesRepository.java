package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LanguagesRepository extends CrudRepository<Languages, String>{
	
	
//	findByTopic

	  public List<Languages>  findByStudentId(String studentId);//  camelcase
	  
	  

}