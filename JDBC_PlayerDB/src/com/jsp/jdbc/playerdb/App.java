package com.jsp.jdbc.playerdb;
import java.util.Scanner;
import com.jsp.jdbc.playerdb.dao.PlayerDao;

public class App {

	public static void main(String[] args) {	


		Scanner sc = new Scanner(System.in);
		PlayerDao p = new PlayerDao();
		System.out.println("Welcome to JDBC Application");
		int i=0;
		while(i==0) {
			System.out.println("\nTo add Player :                                  1");
			System.out.println("To Find Player by Country Name :                 2");
			System.out.println("To Find Player by Player IPL Team :              3");
			System.out.println("To Find Player by group of Player Age :          4");
			System.out.println("To Update Player Salary by Player ID :           5");
			System.out.println("To Update Player Salary by group Of Player Age : 6");
			System.out.println("To Delete Player by Country Name :               7");
			System.out.println("To Delete Player by Player ID :                  8");
			System.out.println("To exit JDBC Application :                       9");
			System.out.println("\nEnter the choice: ");
			int choice = sc.nextInt();

			switch(choice) {
			case 1:
				p.addPlayer();
				break;
			case 2:
				p.findAllPlayersByCountry();
				break;
			case 3:
				p.findPlayerByIplTeam();
				break;
			case 4:
				p.findPlayerBetweenAge();
				break;
			case 5:
				p.updatePlayerSalaryById();
				break;
			case 6:
				p.updateSalaryBetweenAge();
				break;
			case 7:
				p.deleteAllPlayerByCountry();
				break;
			case 8:
				p.deletePlayerById();
				break;
			case 9:
				System.out.println("Thank you for using our application");
				System.exit(0);
			default :
				System.out.println("Please Enter only the above choices.");
			}


		}
		//p.addPlayer();
		//p.findAllPlayersByCountry();
		//p.updatePlayerSalaryById();
		//p.updateSalaryBetweenAge();
		//p.deleteAllPlayerByCountry();
	}
}


