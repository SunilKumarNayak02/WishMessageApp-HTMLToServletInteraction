package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter object from the response object
		PrintWriter pw=res.getWriter();
		// set response content type
		res.setContentType("text/html");
		
		//write the b.logic
		LocalDateTime ldt=LocalDateTime.now();  //  gives the system date and time
		//get current hour of the day
		int hour=ldt.getHour();
		
		if(hour<12)
			pw.println("<h1 style='color:orange;text-align:center'> Good Morning </h1>");
		else if(hour<16)
			pw.println("<h1 style='color:red;text-align:center'> Good Afternoon </h1>");
		else if(hour<20)
			pw.println("<h1 style='color:red;text-align:center'> Good Evening </h1>");
		else 
			pw.println("<h1 style='color:red;text-align:center'> Good Night </h1>");
		
		//add the hyperlink
		pw.println("<a href='http://localhost:3131/WishMessageApp-HTMLToServletInteraction/page.html'> home </a>");
			
		//close the stream
		pw.close();
	}//doGet(-,-)
}//class
