package com.Advertiser; // page 4

public class Advertiser { 
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String userName;
	private String password;
	
	public Advertiser(int id, String name, String email, String phone, String userName, String password) {
	
		this.id = id;		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}

	
	// Create getters to get the values
	
	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	
	public String getEmail() {
		return email;
	}

	

	public String getPhone() {
		return phone;
	}

	

	public String getUserName() {
		return userName;
	}

	

	public String getPassword() {
		return password;
	}

	
	
	
	
	
}
