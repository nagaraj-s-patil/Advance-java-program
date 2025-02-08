package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Addnum extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String num1=req.getParameter("num1");
		
		String num2=req.getParameter("num2");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		
		PrintWriter pw=res.getWriter();
		
		pw.print("<h1>this sum is :"+(n1+n2)+"</h1>");
		
		
		
		
		
	}
	
}
