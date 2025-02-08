package com.jsp.jdbc.steps;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBC_Statement_Insert {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		try {
			//step1 load and register the driver
			Driver driver =new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			//step2 Establish the connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");

			//step3 create statement
			Statement st=conn.createStatement();

			System.out.println("Enter the query");
			String q=sc.nextLine();

			//step 4 Execute the Query
			int rowsInserted =st.executeUpdate(q);

			//step 5 process the results
			if(rowsInserted >0) {
				System.out.println(rowsInserted+"data inserted successfullu !");

			}
			else {
				System.out.println("Data is not inserted");
			}
			
			//step 6 close the connection
			conn.close();

		}
		catch(SQLException e) {
			e.printStackTrace();	
			}

		sc.close();
	}

}
