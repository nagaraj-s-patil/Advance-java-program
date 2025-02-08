package com.jsp.servlet.cardb;

import java.io.IOException;
import java.net.http.HttpClient;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCarServlet  extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int carId=Integer.parseInt(req.getParameter("carId"));
		
		Connection conn=null;
		
		//jdbc 
		
	}
}
