package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CatalogItem;
import com.example.demo.model.Movie;
import com.example.demo.model.Rating;
import com.example.demo.model.UserRating;

@RestController
@Controller
@RequestMapping("/catalog")
public class MovieCatalogController {


	// get all ratd mvie id's
	// for each movie id, get info-> moviename, movie description
	// put them all together 

	@Autowired
	private RestTemplate restTemplate ;

//	@Autowired
//	private  WebClient.Builder webClientBuilder;
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String  userId) {

//      WebClient.Builder builder = WebClient.builder();

		List<Rating>  ratingList = Arrays.asList(new Rating("123",4),new Rating("5678", 3));
		
//		UserRating userRating = restTemplate.getForObject("http://localhost:9003/ratingsdata/users/3",UserRating.class );

		UserRating userRating = restTemplate.getForObject("http://localhost:8123/ratingsdata/users/3",UserRating.class );
System.out.println("******************output******************" +userRating);
		return userRating.getUserRating().stream()
				.map(rating -> {
//					Movie  movie = webClientBuilder.build()
//					.get()
//					.uri("http://localhost:9002/movies/"+rating.getMovieId())
//					.retrieve()
//					.bodyToMono(Movie.class)
//					.block();
					
					Movie movie = restTemplate.getForObject("http://localhost:8122/movies/"+rating.getMovieId(), Movie.class);
					return new CatalogItem(movie.getName(),"aliens description",rating.getRating());
				})
				.collect(Collectors.toList());

		//		return Collections.singletonList(new CatalogItem("spiderman","test",4));
	}

}