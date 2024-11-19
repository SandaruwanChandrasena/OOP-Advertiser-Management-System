package com.Advertiser;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdvertiserDBConnect {
	
	// Database connection parameters
	private static String url = "jdbc:mysql://localhost:3306/test"; // JDBC URL for your database
	private static String username = "root"; // Database username
	private static String password = "21919"; // Database password
	
	private static Connection con; 
	
	// Get a database connection
	public static Connection getConnection() {
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			
			con = DriverManager.getConnection(url, username, password);
			
		} catch(Exception e) {
			
			// If an exception occurs during the connection process, print an error message
			
			System.out.println("Database Connection is not Success!!");
		}
		
		// Return the established database connection (or null if it failed)
		return con;
	}
}
