package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Course;
import com.example.demo.CourseRepository;
import com.example.demo.Topic;
import com.example.demo.TopicRepository;



@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public  List<Course>  getAllCourses(String topicId){
//		return topicList;
		List<Course> courseList = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courseList::add);
		return courseList;
		
	}
	public  Course  getCourse(String id){
//		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return courseRepository.findById(id).get();
	}

	public  void  addCourse(Course course){
//		topicList.add(topic);
		courseRepository.save(course);
	}
	public  void  updateCourse(Course course){
//		for(int i = 0; i<topicList.size(); i++) {
//			Topic t = topicList.get(i);
//			if(t.getId().equals(id)) {
//				topicList.set(i, topic);
//			}
//		}
		System.out.println("***********");
		courseRepository.save(course);

	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}