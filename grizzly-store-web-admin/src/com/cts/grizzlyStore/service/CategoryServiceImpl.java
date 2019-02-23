package com.cts.grizzlyStore.service;

import com.cts.grizzlyStore.bean.Category;
import com.cts.grizzlyStore.dao.CategoryDAO;
import com.cts.grizzlyStore.dao.CategoryDAOImpl;

public class CategoryServiceImpl implements CategoryService {
	
	

	private CategoryServiceImpl() {}
	
	
	private static CategoryServiceImpl categoryServiceImpl;
	
	public static CategoryServiceImpl getInstance()
	{
		if(categoryServiceImpl==null)
		{
			categoryServiceImpl=new CategoryServiceImpl();
			return categoryServiceImpl;
		}
		else
			return categoryServiceImpl;
	}
	
	
	
	private CategoryDAO dao=CategoryDAOImpl.getInstance();

	@Override
	public String addCategory(Category category) {
		// TODO Auto-generated method stub
		
		return dao.addCategory(category);
	}

	@Override
	public String deleteCategory(String categoryType) {
		// TODO Auto-generated method stub
		
		return dao.deleteCategory(categoryType);
	}

	@Override
	public String updateCategory(Category category) {
		// TODO Auto-generated method stub
		return dao.updateCategory(category);
	}

	@Override
	public Category getCategory(String categoryType) {
		// TODO Auto-generated method stub
		return dao.getCategory(categoryType);
	}

}
