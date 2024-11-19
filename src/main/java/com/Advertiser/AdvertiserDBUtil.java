package com.Advertiser; // page 3

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class AdvertiserDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	// Validate part
	public static boolean validate(String userName, String password) {
		
		
		try {
			
			con = AdvertiserDBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from advertiser2 where a_username='" + userName + "'and a_password='" + password+ "'";
			
			// For run this sql queary we have to create ResultSet

			rs = stmt.executeQuery(sql);
			

			if (rs.next()) {
				
				isSuccess = true;
				
			} else {
				
				isSuccess = false;
			}
			
			
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
		
	}
	
	
	// Return Adverticer details as a List
		// static method
		public static List<Advertiser> getAdvetiser(String userName) {

			ArrayList<Advertiser> advertiser = new ArrayList<>();
		
			
		try {
			
			
			con = AdvertiserDBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from advertiser2 where a_username='" + userName + "'";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				Advertiser ads = new Advertiser(id, name, email, phone, username, password);
				
				advertiser.add(ads);
				
			}
			
			
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
			
			
			
	return advertiser;
	
	
	
	}
	
	
	
	

	public static boolean insertAdvertiser(String name, String email, String phone, String username, String password) {

		boolean isSuccess = false;

		
		try {
			
			con = AdvertiserDBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "insert into advertiser2 values (0, '" + name + "', '" + email + "', '" + phone + "', '"+ username + "', '" + password + "') ";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {

				isSuccess = false;

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return isSuccess;

	}
	
	
	public static boolean updateAdvertiser(String id,String name, String email, String phone, String username, String password) {
		
		try {
			
			con = AdvertiserDBConnect.getConnection();
			stmt = con.createStatement();
			String sql="update Advertiser2 set a_name='"+name+"', a_email='"+email+"', a_phone='"+phone+"', a_username='"+username+"', a_password='"+password+"'"
					+ "where a_id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0) {
				isSuccess = true;
			} else {

				isSuccess = false;

			}
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static List<Advertiser> getAdvertiserDetails(String Id) {
		
		//use wrapper class to convert String type Id to Integer type Id
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Advertiser> ads = new ArrayList<>();
		
		try {
			
			con = AdvertiserDBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from Advertiser2 where a_id='"+convertedID+"'";
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				Advertiser a = new Advertiser(id, name, email, phone, username, password);
				
				ads.add(a);
				
			}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return ads;
	}
	
	
	public static boolean deleteAdvertiser(String id) {
		
		int convID = Integer.parseInt(id);
		
		try {
			
			con = AdvertiserDBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "delete from Advertiser2 where a_id ='"+convID+"'";
			
			int r = stmt.executeUpdate(sql);
			
			if (r > 0) {
				
				isSuccess = true;
			}
			else {
				
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	

}
