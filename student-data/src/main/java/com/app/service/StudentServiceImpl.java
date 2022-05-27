package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.dao.StudentDao;
import com.app.entity.ResponseData;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;

	@Override
	public ResponseEntity<ResponseData> getStudent(Long studentId) {
		
		return studentDao.getStudent(studentId);
	}

}
