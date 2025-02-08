package com.jsp.hibernete.shopping_cast;

import java.util.Scanner;

import com.jsp.hibernete.shopping_cast.dao.ShoppingCastDao;

public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ShoppingCastDao shop=new ShoppingCastDao();
		
		while(true) {
			System.out.println("add  priduct in the Enter 1");
			System.out.println("add User With  Cart Enter 2");
			System.out.println("aad Product To User Car Enter 3");
			System.out.println("remove Product From User Cart Enter 4");
			
			
			int choice=sc.nextInt();
			
			
			
		}
	}
}
