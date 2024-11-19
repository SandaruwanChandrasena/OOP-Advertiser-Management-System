package com.Advertiser;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdvertiserUpdateServlet")
public class AdvertiserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// make veriables to store data that come from Advertiserupdate page and pass update page input field names
		String id = request.getParameter("adsid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("Aname");
		String password = request.getParameter("Apass");
		
		// make boolean variable for catch the booean value come from DBUtil
		
		boolean isTrue;
		
		isTrue = AdvertiserDBUtil.updateAdvertiser(id, name, email, phone, username, password);
		
		if (isTrue == true) {
			
			List<Advertiser>adsDetails = AdvertiserDBUtil.getAdvertiserDetails(id);
			
			request.setAttribute("adsDetails", adsDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("AdvertiserAccount.jsp");
			dis.forward(request, response);
			
		} else {
			
			List<Advertiser>adsDetails = AdvertiserDBUtil.getAdvertiserDetails(id);
			
			request.setAttribute("adsDetails", adsDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("AdvertiserAccount.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
