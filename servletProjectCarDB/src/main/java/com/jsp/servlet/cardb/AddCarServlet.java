package com.jsp.servlet.cardb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-car")
public class AddCarServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int carId=Integer.parseInt(req.getParameter("carId"));
		String carModule=req.getParameter("carModel");
		String carBrand=req.getParameter("carBrand");
		String carColor=req.getParameter("carColor");
		int carPrice=Integer.parseInt(req.getParameter("carPrice"));

		Connection conn=null;
		//JDBC Logic
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_cardb?user=root&password=root");

			PreparedStatement pst=conn.prepareStatement("insert into car values(?,?,?,?,?)");

			pst.setInt(1, carId);
			pst.setString(2, carBrand);
			pst.setString(3, carModule);
			pst.setString(4, carColor);
			pst.setInt(5, carPrice);

			pst.execute();
			resp.sendRedirect("index.jsp");
		}catch (ClassNotFoundException | SQLException e) {

			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}
	}
}
