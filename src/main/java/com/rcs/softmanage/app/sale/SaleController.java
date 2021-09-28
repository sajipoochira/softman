package com.rcs.softmanage.app.sale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sale")
public class SaleController {
	@GetMapping
	public String getSales() {
		return "Working";
		
	}
	
	@GetMapping("/api/v1/sale/{id}")
	public long getSale(@RequestBody long Id) {
		
		return Id;
	}
	@PostMapping
	public Sale addSale(@RequestBody Sale sale) {
		
		return sale;
	}

}
