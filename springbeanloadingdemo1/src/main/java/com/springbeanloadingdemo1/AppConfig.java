package com.springbeanloadingdemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
//	@Bean
//	@Lazy
//	public Employee employee() {
//		return new Employee();
//	}
	@Bean
	@Scope("prototype")
	@Lazy
	public Employee employee() {
		return new Employee();
	}
}
