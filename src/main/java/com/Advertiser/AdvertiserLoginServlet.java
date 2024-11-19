package com.Advertiser; //page 2

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdvertiserLoginServlet")
public class AdvertiserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		
		PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
		
		// make variables to catch the username and password that is sent by the AdvertiserLogin.jsp page
		String username = request.getParameter("uid"); // AdvertiserLogin.jsp page username name
		String password = request.getParameter("pass"); // AdvertiserLogin.jsp page password name
		
		boolean isTrue;
		
		isTrue = AdvertiserDBUtil.validate(username, password);
		
		if (isTrue == true) {
			
			List<Advertiser> adsDetails = AdvertiserDBUtil.getAdvetiser(username);
			request.setAttribute("adsDetails", adsDetails);
			
			
			request.getSession().setAttribute("adsDetails", adsDetails); // set the send thigs to AdvertiserAccount.java page by using request.setAttribute() method 
			request.getSession().setAttribute("isAdvertiserLoggedIn", true);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("AdvertiserAccount.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			out.println("<Script type='text/javascript'>");
        	out.println("alert('your username or password is incorrect');");
        	out.println("location='AdvertiserLogin.jsp'");
        	out.println("</script>");
			
		}
		
	}
	

}
