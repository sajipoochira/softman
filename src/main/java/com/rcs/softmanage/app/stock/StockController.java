package com.rcs.softmanage.app.stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stock")
public class StockController {
	@GetMapping
	public String getStock() {
		return "Working";
		
	}
	
	@GetMapping("/{id}")
	public long getStock(@RequestBody long id) {
		
		return id;
	}

}
