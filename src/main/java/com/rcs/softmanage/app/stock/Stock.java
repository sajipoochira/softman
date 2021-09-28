package com.rcs.softmanage.app.stock;

import javax.persistence.*;

@Entity
@Table
public class Stock {
	
	@Id
	private long ProductId;
	private int Qty;
	
	public Stock() {
		super();
	}


	public Stock(long productId, int qty) {
		super();
		ProductId = productId;
		Qty = qty;
	}


	public long getProductId() {
		return ProductId;
	}


	public void setProductId(long productId) {
		ProductId = productId;
	}


	public int getQty() {
		return Qty;
	}


	public void setQty(int qty) {
		Qty = qty;
	}


	

}
