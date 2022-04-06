package com.springbeanscopesdemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	@Bean
	@Scope("prototype")
	public Employee employee1() {
		return new Employee();
	}
}
