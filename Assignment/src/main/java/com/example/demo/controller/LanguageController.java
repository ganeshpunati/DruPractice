package com.example.demo.controller;

import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Language;
@RestController
public class LanguageController {
	

	@RequestMapping("/lng")
	public List<Language> getLanguages() {
		return Arrays.asList(
				 new Language("japanese", 100),
				 new Language("Chinese", 200));
				
				
	}
	

}