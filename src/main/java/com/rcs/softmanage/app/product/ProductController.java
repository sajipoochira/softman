package com.rcs.softmanage.app.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	@GetMapping
	public String getProducts() {
		return "Working";
		
	}
	
	@GetMapping("/{id}")
	public String getProduct(@PathVariable long id) {
		System.out.println(id);
		return "working";
	}
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		
		return product;
	}

}
