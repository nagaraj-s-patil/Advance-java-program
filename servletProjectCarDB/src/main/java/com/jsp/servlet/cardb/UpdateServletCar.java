package com.jsp.servlet.cardb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update-car")
public class UpdateServletCar extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int carId=Integer.parseInt(req.getParameter("carId"));

		Connection conn=null;
		//JDBC Logic
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_cardb?user=root&password=root");

			PreparedStatement pst=conn.prepareStatement("select * from car where carId=? ");
			pst.setInt(1, carId);
			RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
			rd.forward(req, resp);

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