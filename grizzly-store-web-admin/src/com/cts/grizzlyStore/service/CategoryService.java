package com.cts.grizzlyStore.service;

import com.cts.grizzlyStore.bean.Category;

public interface CategoryService {
	
	public String  addCategory(Category category);
	public String deleteCategory(String categoryType);
	public String updateCategory(Category category);
	public Category getCategory(String categoryType);
	

}
