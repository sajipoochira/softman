package com.rcs.softmanage.app.productcategory;

import javax.persistence.*;

@Entity
@Table
public class ProductCategory {
	
	@Id
	private long Id;
	private String Name;
	private String Description;
	
	public ProductCategory() {
		super();
	}

	public ProductCategory(long id, String name, String description) {
		super();
		Id = id;
		Name = name;
		Description = description;
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
