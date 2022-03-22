package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Languages;
import com.example.demo.LanguagesRepository;

@Service
public class LanguagesService {

	@Autowired
	private LanguagesRepository languagesRepository;
	
	public  List<Languages>  getAllLanguages(String studentId){
//		return topicList;
		List<Languages> languageList = new ArrayList<>();
		languagesRepository.findByStudentId(studentId).forEach(languageList::add);
		return languageList;
		
	}
	public  Languages  getLanguages(String id){
//		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return languagesRepository.findById(id).get();
	}

	public  void  addLanguages(Languages language){
//		topicList.add(topic);
		languagesRepository.save(language);
	}
	public  void  updateLanguages(Languages language){
//		for(int i = 0; i<topicList.size(); i++) {
//			Topic t = topicList.get(i);
//			if(t.getId().equals(id)) {
//				topicList.set(i, topic);
//			}
//		}
		System.out.println("***********");
		languagesRepository.save(language);

	}
	public void deleteLanguages(String id) {
		languagesRepository.deleteById(id);
	}
}