package com.cts.grizzlyStore.bean;

public class Category {
	
	private String  categoryType;
	private String description;
	private int products;
	
	
	public Category(String categoryType, String description, int products) {
		super();
		this.categoryType = categoryType;
		this.description = description;
		this.products = products;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProducts() {
		return products;
	}
	public void setProducts(int products) {
		this.products = products;
	}
	


}
