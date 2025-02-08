package com.jsp.jdbc.propertiesFile;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC_Properties {

	public static void main(String[] args) {
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			FileReader fr=new FileReader("JDBC_Connection.properties");
			Properties p=new Properties();
			
			p.load(fr);
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb",p);
			PreparedStatement pst=conn.prepareStatement("select * from student");
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
		}catch(ClassNotFoundException |SQLException | IOException e) {
			
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
