package com.cjc.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
	
	
@Id
	private Integer id;
	
	
	private String name;
	
	
	private Double price;
	
	

}
