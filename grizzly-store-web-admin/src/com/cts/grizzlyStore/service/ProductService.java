package com.cts.grizzlyStore.service;

import java.util.List;

import com.cts.grizzlyStore.bean.Product;

public interface ProductService {
	public String  addPropduct(Product product);
	public Product getProduct(String productId);
	public List<Product> getProducts();
}
