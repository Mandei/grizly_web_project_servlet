package com.cts.grizzlyStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.grizzlyStore.bean.Product;
import com.cts.grizzlyStore.util.DBUtils;

public class ProductDAOImpl implements ProductDAO {

	
	
	private Connection connection=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	@Override
	
	public String addPropduct(Product product) {

		String insertStatement = "insert into product(productId,categoryId,name,description,price,brand) " + "values(?,?,?,?,?,?)";
		connection = DBUtils.getConnection();
		
		 try
		 {
			 
		 preparedStatement = connection.prepareStatement(insertStatement);
		 preparedStatement.setString(1,product.getProductId());
		 preparedStatement.setString(2,product.getCategoryId());
		 preparedStatement.setString(3, product.getName());
		 preparedStatement.setString(4,product.getDescription());
		 preparedStatement.setInt(5,product.getPrice());
		 preparedStatement.setString(6,product.getBrand());
		
		 
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
	public Product getProduct(String productId) {
		String getStatement = "select * from product where productId=?";
		connection = DBUtils.getConnection();
		 try{
		 preparedStatement = connection.prepareStatement(getStatement);
		 preparedStatement.setString(1,productId);
		 
		resultSet=preparedStatement.executeQuery();
		
		Product product=null;
		
		if(resultSet.next())	
		{
			
			String categoryId= resultSet.getString("categoryId");
			String name =resultSet.getString("name");
			String description = resultSet.getString("description");
			int price = resultSet.getInt("price");
			String brand=resultSet.getString("brand");
			float rating=resultSet.getFloat("rating");
			product=new Product(productId, categoryId, name, description, price, brand, rating);
			return product;
			
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
	public List<Product> getProducts(){
		List <Product> list=new ArrayList<>();
		String getStatement = "select * from product";
		connection = DBUtils.getConnection();
		 try{
		 preparedStatement = connection.prepareStatement(getStatement);
		 resultSet=preparedStatement.executeQuery();
		
		Product product=null;
		
		while(resultSet.next())	
		{
			String productId=resultSet.getString("productId");
			String categoryId= resultSet.getString("categoryId");
			String name =resultSet.getString("name");
			String description = resultSet.getString("description");
			int price = resultSet.getInt("price");
			String brand=resultSet.getString("brand");
			float rating=resultSet.getFloat("rating");
			product=new Product(productId, categoryId, name, description, price, brand,rating);
			list.add(product);
		}
		return list;
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
	}

}
