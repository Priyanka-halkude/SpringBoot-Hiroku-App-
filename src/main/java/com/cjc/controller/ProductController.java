package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.entity.Product;
import com.cjc.repo.ProductRepository;

@RestController
public class ProductController {
	@Autowired
	private ProductRepository repo;
	
	@PostMapping(value="/product",consumes= {"application/json"})
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		
		
		Product save = repo.save(product);
		
		
		return new ResponseEntity<String> ("Product saved",HttpStatus.CREATED);
		
 		
		
	}
	@GetMapping(value="/products",produces= {"application/json"})
	public ResponseEntity<List<Product>> getAll(){
		
		List<Product> products = repo.findAll();
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		
		
	}
	
	
	
	

}
