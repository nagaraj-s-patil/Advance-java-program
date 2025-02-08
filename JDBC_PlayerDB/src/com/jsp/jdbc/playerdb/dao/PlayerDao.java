package com.jsp.jdbc.playerdb.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PlayerDao {
	Scanner scan = new Scanner(System.in);

	Connection conn = null;

	public Connection connectionBuilder() {



		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_Playerdb?user=root&password=root");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		}
		return conn;
	}



	public void addPlayer() {

		conn= connectionBuilder();

		try {

			PreparedStatement pst = conn.prepareStatement("INSERT INTO player VALUES(?,?,?,?,?,?)");

			System.out.println("Enter the Player ID: ");

			pst.setInt(1,scan.nextInt() );

			System.out.println("Enter the Player Name: ");

			pst.setString(2, scan.next());
			String playerName = scan.nextLine();

			System.out.println("Enter the Player Age: ");

			pst.setInt(3,scan.nextInt());

			System.out.println("Enter the Player Country: ");

			pst.setString(4, scan.next());

			System.out.println("Enter the Player IPL Team: ");

			pst.setString(5, scan.next());

			System.out.println("Enter the Player IPL Salary: ");

			pst.setInt(6, scan.nextInt());



			int rowsInserted = pst.executeUpdate();



			if(rowsInserted>0) {

				System.out.println(rowsInserted+" data inserted successfully.");

			}else {

				System.out.println("Data is not inserted.");

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}


	}



	public void findAllPlayersByCountry() {

		conn=connectionBuilder();

		try {

			PreparedStatement pst = conn.prepareStatement("SELECT playerName FROM player WHERE playerCountry =?");

			System.out.println("Enter the Country Name: ");

			pst.setString(1, scan.next());



			ResultSet rs = pst.executeQuery();

			while(rs.next()) {

				System.out.println(rs.getString(1));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



	public void findPlayerByIplTeam() {

		conn=connectionBuilder();

		try {

			PreparedStatement pst = conn.prepareStatement("SELECT playerName FROM player WHERE iplTeam =?");

			System.out.println("Enter the IPL Team: ");

			pst.setString(1, scan.next());



			ResultSet rs = pst.executeQuery();

			while(rs.next()) {

				System.out.println(rs.getString(1));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



	public void findPlayerBetweenAge() {

		conn=connectionBuilder();

		try {

			PreparedStatement pst = conn.prepareStatement("SELECT playerName FROM player WHERE playerAge>? and playerAge<?");

			System.out.println("Enter the Ages between the players: ");

			pst.setInt(1, scan.nextInt());

			pst.setInt(2, scan.nextInt());



			ResultSet rs = pst.executeQuery();

			while(rs.next()) {

				System.out.println(rs.getString(1));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



	public void updatePlayerSalaryById() {

		conn=connectionBuilder();

		try {

			String s = "UPDATE player SET iplSalaray=iplSalaray+5000000 WHERE playerId=?";

			PreparedStatement pst = conn.prepareStatement(s);

			System.out.println("Enter player ID to update the data: ");

			pst.setInt(1, scan.nextInt());

			int rowsUpdated=pst.executeUpdate();

			if(rowsUpdated>0) {

				System.out.println(rowsUpdated+" updated succesfully");

			}else {

				System.out.println("Table record is not updated");

			}





		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



	public void updateSalaryBetweenAge() {

		conn=connectionBuilder();

		try {

			String s = "UPDATE player SET iplSalary=iplSalary+5000000 WHERE playerAge>=? and playerAge<=?";

			PreparedStatement pst = conn.prepareStatement(s);

			System.out.println("Enter player age group you want to update: ");

			System.out.println("Lower Age Limit: ");

			pst.setInt(1, scan.nextInt());

			System.out.println("Upper Age Limit");

			pst.setInt(2, scan.nextInt());

			int rowsUpdated=pst.executeUpdate();

			if(rowsUpdated>0) {

				System.out.println(rowsUpdated+" updated succesfully");

			}else {

				System.out.println("Table record is not updated");

			}





		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



	public void deleteAllPlayerByCountry() {

		conn=connectionBuilder();

		try {

			String s = "DELETE FROM player WHERE playerCountry=?";

			PreparedStatement pst = conn.prepareStatement(s);

			System.out.println("Enter player country name whose record you want to delete: ");

			pst.setString(1, scan.next());

			int rowsUpdated=pst.executeUpdate();

			if(rowsUpdated>0) {

				System.out.println(rowsUpdated+" record deleted succesfully");

			}else {

				System.out.println("Player record is not deleted");

			}





		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}



	public void deletePlayerById() {

		conn=connectionBuilder();

		try {

			String s = "DELETE FROM player WHERE playerId=?";

			PreparedStatement pst = conn.prepareStatement(s);

			System.out.println("Enter player ID whose record you want to delete: ");

			pst.setInt(1, scan.nextInt());

			int rowsUpdated=pst.executeUpdate();

			if(rowsUpdated>0) {

				System.out.println(rowsUpdated+" record deleted succesfully");

			}else {

				System.out.println("Player record is not deleted");

			}





		} catch (SQLException e) {


			e.printStackTrace();

		}

	}
}
