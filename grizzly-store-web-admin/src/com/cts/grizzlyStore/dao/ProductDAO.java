package com.cts.grizzlyStore.dao;

import java.util.List;

import com.cts.grizzlyStore.bean.Product;

public interface ProductDAO {

	public String  addPropduct(Product product);
	public Product getProduct(String productId);
	public List<Product> getProducts();
	
	
}
