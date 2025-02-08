package com.jsp.jdbc.second_way;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBC_Insert_Execute {

	public static void main(String[] args) {

		Connection conn=null;

		try {
			//step1: Load & Register the Driver	
			Class.forName("com.mysql.cj.jdbc.Driver");

			//step2:Estableish the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb?user=root&password=root");

			//step3: Create statement
			Statement st=conn.createStatement();

			//step4:Execute the Query
			boolean result =st.execute("Insert into student values (200,'ravi','r@gmail.com',70)");

			//step5:Process the result
			System.out.println(result);

			if(result==false)
				System.out.println("data inserted!");
			else
				System.out.println("data not inserted");


		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {

				try {
					//step 6:close the connection 
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}

