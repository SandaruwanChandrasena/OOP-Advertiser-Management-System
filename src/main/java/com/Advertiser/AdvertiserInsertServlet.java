package com.Advertiser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdvertiserInsertServlet")
public class AdvertiserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// create variables to srote values that is taken by AdvertiserInsert.jsp page
		// pass the values under "name" of inpud method at AdvertiserInsert.jsp page
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		
		boolean isTrue;
		
		// assign return value of DBUtil insertmethod
		isTrue = AdvertiserDBUtil.insertAdvertiser(name, email, phone, username, password);
		
		
		if (isTrue == true) {
			// use RequestDispatcher to Redirect anothder page
			RequestDispatcher dis = request.getRequestDispatcher("AdvertiserLogin.jsp");
			dis.forward(request, response);
			
		} else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("AdvertiserInsert.jsp");
			dis2.forward(request, response);
		}
	}

}
