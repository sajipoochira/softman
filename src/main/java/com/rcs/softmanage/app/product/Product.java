package com.rcs.softmanage.app.product;

import javax.persistence.*;

@Entity
@Table
public class Product {
	
	@Id
	private long Id;
	private String Name;
	private String Description;
	private String Catogery;
	
	
	public Product() {
		super();
	}

	public Product(long id, String name, String description, String catogery) {
		super();
		Id = id;
		Name = name;
		Description = description;
		Catogery = catogery;
	}

	public String getCatogery() {
		return Catogery;
	}

	public void setCatogery(String catogery) {
		Catogery = catogery;
	}

	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}
