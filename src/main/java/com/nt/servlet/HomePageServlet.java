package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HomePageServlet extends HttpServlet {
	
	
  @Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   //get PrintWrtier stream
	   PrintWriter pw=res.getWriter();
	   //set response content type
	   //res.setContentType("text/html");
	   
	   // add home page content  having hyperlink
	   
	   pw.println("<h1 style=\"color:red;text-align:center\"> HTML To Servlet Communication Using Hyperlinks(HomeServlet)</h1><br>");
	   
	   pw.println("<a href='wishurl'> Get WishMessage</a>");
	   
	   //close stream
	   pw.close();
   }//service(-,-)

}//class
