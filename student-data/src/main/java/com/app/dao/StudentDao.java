package com.app.dao;

import org.springframework.http.ResponseEntity;

import com.app.entity.ResponseData;

public interface StudentDao {
	
	public ResponseEntity<ResponseData> getStudent(Long studentId);
}
