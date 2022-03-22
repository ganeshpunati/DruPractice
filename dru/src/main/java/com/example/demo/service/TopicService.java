package com.example.demo.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Topic;
import com.example.demo.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public  List<Topic>  getAllTopics(){
//		return topicList;
		List<Topic> topicsList = new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
		
	}
	public  Topic  getTopic(String id){
//		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findById(id).get();
	}

	public  void  addTopic(Topic topic){
//		topicList.add(topic);
		topicRepository.save(topic);
	}
	public  void  updateTopic(String id,Topic topic){
//		for(int i = 0; i<topicList.size(); i++) {
//			Topic t = topicList.get(i);
//			if(t.getId().equals(id)) {
//				topicList.set(i, topic);
//			}
//		}
		topicRepository.save(topic);

	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
//		topicList.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}
}