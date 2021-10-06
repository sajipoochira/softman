package com.rcs.softmanage.app.productcategory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product/category")
public class ProductCategoryController {
	@GetMapping
	public String getProductCategory() {
		return "Working";
		
	}
	
	

}
