package com.rcs.softmanage.app.purchase;

import javax.persistence.*;

@Entity
@Table
public class Purchase {
	
	@Id
	private long ProductId;
	private int Qty;
	private int UnitPrice;
	private int Amount;
	
	
	public Purchase() {
		super();
	}


	public Purchase(long productId, int qty, int unitPrice, int amount) {
		super();
		ProductId = productId;
		Qty = qty;
		UnitPrice = unitPrice;
		Amount = amount;
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


	public int getUnitPrice() {
		return UnitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}


	public int getAmount() {
		return Amount;
	}


	public void setAmount(int amount) {
		Amount = amount;
	}

	
	

}
