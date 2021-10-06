package com.rcs.softmanage.app.purchase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchase")
public class PurchaseController {
	@GetMapping
	public String getPurchases() {
		return "Working";
		
	}
	
	@GetMapping("/{id}")
	public long getPurchase(@RequestBody long id) {
		
		return id;
	}
	@PostMapping
	public Purchase addPurchase(@RequestBody Purchase purchase) {
		
		return purchase;
	}

}
