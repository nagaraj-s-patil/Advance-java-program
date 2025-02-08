package com.jsp.HibernateProject.ProductDB;

import java.util.Scanner;

import com.jsp.HibernateProject.ProductDB.dao.ProductDAO;
import com.jsp.HibernateProject.ProductDB.entity.Product;

public class App {

	public static void main(String[] args) {
		ProductDAO pd=new ProductDAO();
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("Enter 1 for insert");		
			System.out.println("Enter 2 for find");		
			System.out.println("Enter 3 for update");		
			System.out.println("Enter 4 for Delete");
			System.out.println("Enter 5 for exit");

			int key=sc.nextInt();


			switch (key) {
			case 1:
				pd.addProduct();

				break;

			case 2:
				pd.findProductById();
				break;

			case 3:
				pd.updateProductByID();
				break;
			case 4:
				pd.deleteProductById();
				break;

			case 5:
				System.out.println("thank you");
				System.exit(0);
			default:
				System.out.println("youer chose is wrong");
				break;
			}

		}
	}
}
