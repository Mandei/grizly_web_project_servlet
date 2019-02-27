package com.cts.grizzlyStore.service;

import java.util.List;

import com.cts.grizzlyStore.bean.Product;
import com.cts.grizzlyStore.dao.ProductDAO;
import com.cts.grizzlyStore.dao.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {

	
	ProductDAO dao=new ProductDAOImpl();
	@Override
	
	public String addPropduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addPropduct(product);
	}

	@Override
	public Product getProduct(String productId) {
		// TODO Auto-generated method stub
		return dao.getProduct(productId);
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return dao.getProducts();
	}

}
