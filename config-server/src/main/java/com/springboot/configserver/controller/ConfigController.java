package com.springboot.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${my.project}")
	private String  projectName;
	
	@RequestMapping("/project")
	public String getProject() {
		return projectName;
	}
}
