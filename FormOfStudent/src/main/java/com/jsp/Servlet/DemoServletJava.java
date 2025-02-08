package com.jsp.Servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServletJava extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		int receivedId=Integer.parseInt(req.getParameter("userId"));
		String receivedName=req.getParameter("userName");
		
		req.setAttribute("key1", receivedId);
		req.setAttribute("key2", receivedName);
		
		RequestDispatcher rd=req.getRequestDispatcher("output.jsp");
		
		rd.forward(req, res);
		
		System.out.println("Back to current Servler");
		
		
	}

	
}
