package com.Advertiser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdvertiserLogoutServlet")
public class AdvertiserLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdvertiserLogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getSession().removeAttribute("advertiser"); // set the send thigs to AdvertiserAccount.java page by using request.setAttribute() method 
		request.getSession().removeAttribute("isAdvertiserLoggedIn");
		RequestDispatcher dis = request.getRequestDispatcher("AdvertiserLogin.jsp");
		
		dis.forward(request, response);
	}



}
