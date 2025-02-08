package JDBC.jsp.jdbc_prepated_st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_PST_Insertion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb?user=root&password=root");
			
			PreparedStatement pst=conn.prepareStatement("insert into student values (?,?,?,?)");
			
			System.out.println("Enter student id: ");
			pst.setInt(1, sc.nextInt());
			System.out.println("Enter student name");
			pst.setString(2, sc.next());
			System.out.println("Enter student email");
			pst.setString(3, sc.next());
			System.out.println("Enter student Marks");
			pst.setInt(4,sc.nextInt());
			
			int rowsInserted=pst.executeUpdate();
			
			if(rowsInserted >0) {
			System.out.println(rowsInserted+"data insertd");
			}
			else
				System.out.println("data not insertd");
			
		} catch (ClassNotFoundException  |SQLException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
			if(conn!=null) 
			{

				try 
				{
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
