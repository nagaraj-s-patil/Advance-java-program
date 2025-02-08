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

public class AddMobile extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		int MobileId=Integer.parseInt(req.getParameter("mobileId"));
		String mobileModule =req.getParameter("mobileModule");
		String mobileBrand=req.getParameter("mobileBrand");
		int mobilePrice=Integer.parseInt(req.getParameter("mobilePrice"));
		
		//JDBC Login
		Connection conn=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_mobiledb?user=root&password=root");
		
		PreparedStatement pst=conn.prepareStatement("insert into mobile values(?,?,?,?)");
		
		pst.setInt(1, MobileId);
		pst.setString(2,mobileModule);
		pst.setString(3, mobileBrand);
		pst.setInt(4,mobilePrice);
		int rowsInserted=pst.executeUpdate();
		
		
		if(rowsInserted>0) {
			pw.print("<h1>"+rowsInserted+" data inserted succesfully</h1>");
		}else {
			pw.print("<h1 data inserted succesfully</h1>");
		}
		
		}catch (ClassNotFoundException |SQLException e) {
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
