package com.cts.grizzlyStore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.grizzlyStore.bean.Profile;
import com.cts.grizzlyStore.util.DBUtils;

public class UserDAOImpl implements UserDAO {

	private Connection connection=null;
	@Override
	public int registerUser(Profile user) {
		
		PreparedStatement preparedStatement = null;
		int status=0;
		connection  = DBUtils.getConnection();
		String insertStatement ="insert into login" + "(userId, password, userType, userStatus, contactno, address)" + " values(? , ? , ? , ? , ? , ?)";
		
		try {
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
	
			preparedStatement.setString(1, user.getUserId());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getUserType());
			preparedStatement.setInt(4, status);
			preparedStatement.setLong(5, user.getContactNumber());
			preparedStatement.setString(6, user.getAddress());
	

			preparedStatement.executeUpdate();
			 
			return 1;
			
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
	
	
	public Profile getUserProfile(String id)
	{
		PreparedStatement preparedStatement = null;
		Profile profile=null;
		connection  = DBUtils.getConnection();
		ResultSet resultSet = null;
		String insertStatement ="select * from login where userid = ?";
		
		try {
			
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
			preparedStatement.setString(1, id);	
		    resultSet = preparedStatement.executeQuery();
			
		    if(resultSet.next())
			{
		     profile = new Profile();
			 profile.setUserId(resultSet.getString("userid"));
			 profile.setContactNumber(resultSet.getLong("contactno"));
			 profile.setAddress(resultSet.getString("address"));
			 profile.setName(resultSet.getString("name"));
			 profile.setDesignation(resultSet.getString("designation"));
			 
			 return profile;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return profile;
	}
	
}
