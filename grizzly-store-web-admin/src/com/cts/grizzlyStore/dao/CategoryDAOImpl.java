package com.cts.grizzlyStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.grizzlyStore.util.DBUtils;
import com.cts.grizzlyStore.bean.Category;
import com.cts.grizzlyStore.dao.CategoryDAO;

public class  CategoryDAOImpl implements CategoryDAO {
	
	private Connection connection=null;
	PreparedStatement preparedStatement = null;
	
	

	private CategoryDAOImpl() {}
	
	
	private static CategoryDAOImpl categoryDAOImpl;
	
	public static CategoryDAOImpl getInstance()
	{
		if(categoryDAOImpl==null)
		{
			categoryDAOImpl=new CategoryDAOImpl();
			return categoryDAOImpl;
		}
		else
			return categoryDAOImpl;
	}

	
	@Override
	public String addCategory(Category category) {
		
		
		
		String insertStatement = "insert into category " + "values(?,?,?)";
		connection = DBUtils.getConnection();
		
		 try
		 {
			 
		 preparedStatement = connection.prepareStatement(insertStatement);
		 preparedStatement.setString(1,category.getCategoryType());
		 preparedStatement.setString(2,category.getDescription());
		 preparedStatement.setInt(3, category.getProducts());
		
		 
		 preparedStatement.executeUpdate();
		 return "success";
				 
		 } 
		 catch(SQLException e)
		 {
			 e.printStackTrace();
			 try{
				 connection.rollback();
			 }
			 catch(SQLException e1){
				 e1.printStackTrace();
			 }
			 return "fail";
		 }
		finally{
			
			DBUtils.closeConnection(connection);
			
		}
	}
	
	

	@Override
	public String deleteCategory(String categoryType) {

		String deleteStatement = "delete from category where categoryType=?";
		connection = DBUtils.getConnection();
		 try{
		 preparedStatement = connection.prepareStatement(deleteStatement);
		 
		preparedStatement.setString(1,categoryType);
		 
		preparedStatement.executeUpdate();
		return "success";
				 
		 } 
		 catch(SQLException e)
		 {
			 e.printStackTrace();
			 try{
				 connection.rollback();
			 }
			 catch(SQLException e1){
				 e1.printStackTrace();
			 }
			 return "fail";
		 }
		finally{
			
			DBUtils.closeConnection(connection);
			
		}
		
	}
	

	@Override
	public Category getCategory(String categoryType) {
		ResultSet resultSet=null;
		String getStatement = "select * from category where categoryType=?";
		connection = DBUtils.getConnection();
		 try{
		 preparedStatement = connection.prepareStatement(getStatement);
		 preparedStatement.setString(1,categoryType);
		 
		resultSet=preparedStatement.executeQuery();
		
		Category category=null;
		
		if(resultSet.next())	
		{
			String categorytype = resultSet.getString("categoryType");
			String description = resultSet.getString("description");
			int products = resultSet.getInt("products");
			category=new Category(categorytype, description,products);
			return category;
			
		}
			 
		 } 
		 catch(SQLException e)
		 {
			 e.printStackTrace();
			 
				 try {
					connection.rollback();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			 return null;
		 }
		finally{
			
			DBUtils.closeConnection(connection);
			
		}
		return null;
	}
	
	@Override
	public String updateCategory(Category categoryType) {
		// TODO Auto-generated method stub
		return null;
	}


}
