package com.javainspires.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PostMapping(path="addProduct")
	public String addProduct(Product product) {
	   String insert_query ="insert into products(productId,productName,price)values(?,?,?);";
	   int row =jdbcTemplate.update(insert_query,product.getProductId(),product.getProductName(),product.getPrice());
	   if(row ==1) {
		   return "success";		   
	   }else {
		   return "error";
	   }
	}
}
