package com.cts.grizzlyStore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	public final static String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String driverName ="oracle.jdbc.driver.OracleDriver";
	public static final String userName="hr";
	public static final String password="hr";
	
	public static Connection getConnection() 
	{
		Connection connection = null;
		try{
			
		Class.forName(driverName);
		connection = DriverManager.getConnection(URL, userName, password);
		return connection;
		
		}catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void closeConnection (Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
