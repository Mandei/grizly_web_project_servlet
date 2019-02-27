package com.cts.grizzlyStore.bean;

public class Product {

	private String productId;
	private String categoryId;
	private String name;
	private String description;
	private int price;
	private String brand;
	private float rating;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public Product(String productId, String categoryId, String name, String description, int price, String brand,
			float rating) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
		this.rating = rating;
	}
	
	public Product(String productId, String categoryId, String name, String description, int price, String brand) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}
	
}
