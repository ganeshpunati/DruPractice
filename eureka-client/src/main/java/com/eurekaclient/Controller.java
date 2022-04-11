package com.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/demo")
	public String getGreeting() {
		return "WelCome to java";
	}
}
