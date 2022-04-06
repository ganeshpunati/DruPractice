package com.springbeanlifecycledemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean(initMethod="initData")
	public Employee employee() {
		return new Employee();
	}
	
}
