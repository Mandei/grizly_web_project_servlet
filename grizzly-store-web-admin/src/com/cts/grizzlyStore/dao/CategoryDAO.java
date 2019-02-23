package com.cts.grizzlyStore.dao;

import com.cts.grizzlyStore.bean.Category;

public interface CategoryDAO {
	
	public String  addCategory(Category category);
	public String deleteCategory(String categoryType);
	public String updateCategory(Category category);
	public Category getCategory(String categoryType);
	
}
