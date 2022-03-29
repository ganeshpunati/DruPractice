package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResourceController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		System.out.println("**********************");
		return new Movie(movieId, "movie name is spiderman");
		
	}
	public String hello() {
		System.out.println("hello");
		return "hello";
	}

}