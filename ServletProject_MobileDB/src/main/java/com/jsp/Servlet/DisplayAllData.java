package com.jsp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DisplayAllData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		//JDBC
		
		Connection conn=null;
		try {
			Class.forName("jdbc:mysql://localhost:3306/servlet_mobiledb?user=root&password=root");
			PreparedStatement pst=conn.prepareStatement("select * from mobile");
			
			ResultSet rs=pst.executeQuery();
			
			PrintWriter pw=res.getWriter();
			
			while(rs.next()) {
				pw.print(rs.getInt(1));
				pw.print(rs.getString(2));
				pw.print(rs.getString(3));
				pw.print(rs.getInt(4));
			}
	
	
		} 
		
		catch (ClassNotFoundException | SQLException e) {
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
