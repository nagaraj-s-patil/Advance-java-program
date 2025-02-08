package com.jsp.jdbc.second_way;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select_Execute {

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
			boolean result =st.execute("Select * from student");
			ResultSet rs=st.getResultSet();

			//step5:Process the result
			System.out.println(result);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}

			


		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		finally 
		{
			if(conn!=null) 
			{

				try 
				{
					//step 6:close the connection 
					conn.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

