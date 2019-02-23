package com.cts.grizzlyStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.grizzlyStore.util.DBUtils;

public class LoginDAOImpl implements LoginDAO {

	private Connection connection=null;
	
	private static LoginDAOImpl loginDAOImpl;
	
	
	public static LoginDAOImpl getInstance()
	{
		if(loginDAOImpl==null)
		{
		loginDAOImpl=new LoginDAOImpl();
		return loginDAOImpl;
		}
		
		else
		{
			return loginDAOImpl;
		}
	}
	
	
	

	private LoginDAOImpl(){}
	
	
	
	public int getUserStatus(String userId) {
		String query="Select status from login where userId =?";
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		ResultSet resultset=null;
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			resultset=preparedStatement.executeQuery();
			
			if(resultset.next())
			{
				return resultset.getInt("status");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return -1;
	}
	
	
	

	public String getUserType(String userId) {
		String query="Select userType from login where userId =?";
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		ResultSet resultset=null;
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			resultset=preparedStatement.executeQuery();
			
			if(resultset.next())
			{
				return resultset.getString("usertype");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public boolean authentication(String userId,String password)
	{
		String query="Select userType from login where userId =? and password=?";
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		ResultSet resultset=null;
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			resultset=preparedStatement.executeQuery();
			
			if(resultset.next())
			{
				return true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	

}
