package com.javainspires.springboot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
	 JdbcTemplate jdbcTemplate;
	 
	@PostMapping(path="addUser")
	public String addUser(User user) {
		String insert_query ="insert into user(userName,email,password,create_time)values(?,?,?,?);";
		int rows =jdbcTemplate.update(insert_query,
				user.getUserName(),
				user.getEmail(),
				user.getPassword(),
				new Date());
		if(rows == 1) {
			return "success";
		}else {
			return "error";
		}
		
	}
}
