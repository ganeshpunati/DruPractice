package com.app.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.entity.ResponseData;
@Service
public interface StudentService {
	
	public ResponseEntity<ResponseData> getStudent(Long studentId);
	
}
