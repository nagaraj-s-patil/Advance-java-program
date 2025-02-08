package com.jsp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DeleteMobile extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int mobile_Id=Integer.parseInt(req.getParameter("mobileId"));

		// JDBC connection

		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_mobiledb?user=root&password=root");
			PreparedStatement pst =conn.prepareStatement("delete from mobile where mobileId=?");
			pst.setInt(1, mobile_Id);
			
			int rowcount=pst.executeUpdate();
			PrintWriter pw=res.getWriter();
			if(rowcount>0) {
				pw.print("<h1>"+rowcount+"data is deleted<h1>");
			}
			else
				pw.print("<h1>data not deleted<h1>");
			
		} catch (ClassNotFoundException  |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}	
		finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
