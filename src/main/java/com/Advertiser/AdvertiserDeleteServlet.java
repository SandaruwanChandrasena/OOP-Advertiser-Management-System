package com.Advertiser;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdvertiserDeleteServlet")
public class AdvertiserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("adsid");
		
		boolean isTrue = AdvertiserDBUtil.deleteAdvertiser(id);
		
		if(isTrue == true) {
			
			
			request.getSession().removeAttribute("advertiser");
			request.getSession().removeAttribute("isAdvertiserLoggedIn");

			
			
			RequestDispatcher dis = request.getRequestDispatcher("AdvertiserInsert.jsp");
			dis.forward(request, response);
			
			
			
			
		}
		else {
			
			List<Advertiser> adsDetails = AdvertiserDBUtil.getAdvertiserDetails(id);
			request.setAttribute("adsDetails", adsDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("AdvertiserAccount.jsp");
			dis.forward(request, response);
		}
		
	}

}
