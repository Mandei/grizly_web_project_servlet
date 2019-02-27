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
		String query="Select * from login where userId =? and password=?";
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
			return false;
		}
		
		return false;
	}




	@Override
	public boolean aunthenticateUser(String userId) {
		String query="Select * from login where userid =?";
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		ResultSet resultset=null;
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			
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
	
	
	public int incrementUserStatus(String id)
	{
		int currentStatus = getUserStatus(id);
		currentStatus=currentStatus+1;
		PreparedStatement preparedStatement = null;
		int status=0;
		connection  = DBUtils.getConnection();
		String insertStatement ="update login set status = ? where userId = ?";
		
		try {
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
	
			preparedStatement.setInt(1, currentStatus);
			preparedStatement.setString(2, id);
	
			status = preparedStatement.executeUpdate();
			if(status==1)
			{
				return currentStatus;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return -1;
		
	}
	
	public int resetUserStatus(String id){
		
		
		PreparedStatement preparedStatement = null;
		int status=0;
		connection  = DBUtils.getConnection();
		String insertStatement ="update login set status = ? where userid = ?";
		
		try {
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
	
			preparedStatement.setInt(1, status);
			preparedStatement.setString(2, id);
	
			status = preparedStatement.executeUpdate();
			if(status==1)
			{
				return 1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return -1;
	}
	
	
	

}
