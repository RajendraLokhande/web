package com.springboot.binding;

//import org.springframework.stereotype.Controller;

import lombok.Data;


@Data
public class Product {

	private Integer productId;
	private String productName;
	private Double productPrice;
	
	
}
