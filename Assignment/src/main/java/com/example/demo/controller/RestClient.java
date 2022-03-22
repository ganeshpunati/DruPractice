package com.example.demo.controller;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.example.demo.JsonStudent;

public class RestClient {

	public static final String GET_ALL_API="https://jsonplaceholder.typicode.com/todos/";
	public static final String Get_BY_ID_API = "https://jsonplaceholder.typicode.com/todos/{id}";
	public static final String CREATE_API="https://jsonplaceholder.typicode.com/todos/";
	public static final String DELETE_API="https://jsonplaceholder.typicode.com/todos/{id}";
	//create rest endpoints
	//we gonna consume these endpoints


	static RestTemplate restTemplate = new RestTemplate(); //object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		callGetallAPI();
		callGetByIdApi();
//		callCreateUserAPI();
	}
	private static void callGetallAPI() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//client is expecting json
		//from api response
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<String> result = restTemplate.exchange(GET_ALL_API, HttpMethod.GET,entity,String.class);
//		 restTemplate.exchange
		System.out.println(result);

	}
	
	private static void callGetByIdApi() {
		Map<String,Integer> param = new HashMap();
		param.put("id",10);//need to retrieve user with id 1
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));//client is expecting json
		//from api response
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		 JsonStudent result = restTemplate.getForObject(Get_BY_ID_API, JsonStudent.class,param);
		System.out.println("*****by id ****************");
		System.out.println(result.getId());
		System.out.println(result.getTitle());
		System.out.println(result.getUserId());
		System.out.println(result.isCompleted());
	
	}
	
	public static void callCreateUserAPI() {
		JsonStudent jsonTopic = new JsonStudent(500,5000,"new data",true);
		ResponseEntity<JsonStudent> result = restTemplate.postForEntity(CREATE_API, jsonTopic, JsonStudent.class);
		System.out.println("*************************");
		System.out.println(result.getStatusCode());
		System.out.println(result.getHeaders());
		System.out.println(result.getBody().getId());
	}
	public static void callDeleteAPI() {
		Map<String,Integer> param = new HashMap();
		param.put("id", 20);
		restTemplate.delete(DELETE_API,param);
		System.out.println("*************************");
		System.out.println("*************************");
		
	}
	
}