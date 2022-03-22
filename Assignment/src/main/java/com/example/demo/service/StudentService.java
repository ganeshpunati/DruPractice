package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Student;
import com.example.demo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public  List<Student>  getAllStudent(){
//		return studentsList;
		List<Student> studentsList = new ArrayList<>();
		studentRepository.findAll().forEach(studentsList::add);
		return studentsList;
		
	}
	public  Student  getStudent(String id){
//		return studentsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return studentRepository.findById(id).get();
	}

	public  void  addStudent(Student student){
//		studentsList.add(student);
		studentRepository.save(student);
	}
	public  void  updateStudent(String id,Student student){
//		for(int i = 0; i<studentsList.size(); i++) {
//			Topic t = studentsList.get(i);
//			if(t.getId().equals(id)) {
//				studentsList.set(i, student);
//			}
//		}
		studentRepository.save(student);

	}
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
//		topicList.removeIf(t -> t.getId().equals(id));
		studentRepository.deleteById(id);
	}
}