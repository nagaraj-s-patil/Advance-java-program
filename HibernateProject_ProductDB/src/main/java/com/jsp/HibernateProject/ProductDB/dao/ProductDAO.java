package com.jsp.HibernateProject.ProductDB.dao;
import com.jsp.HibernateProject.ProductDB.entity.Product;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ProductDAO {

	Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);

	SessionFactory sf=cfg.buildSessionFactory();
	Scanner sc=new Scanner(System.in);

	public void addProduct() {

		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();

		Product p=new Product();

		System.out.println("Enter a product ID : ");
		int ProductId=sc.nextInt();

		System.out.println("Enter a product Name : ");
		String ProductName=sc.next();

		System.out.println("Enter a prodct Brand : ");
		String ProductBrand=sc.next();

		System.out.println("Enter a product Price");
		int ProductPrice=sc.nextInt();

		p.setProduct_Id(ProductId);
		p.setProduct_Name(ProductName);
		p.setProduct_Brand(ProductBrand);
		p.setProduct_Price(ProductPrice);

		session.save(p);


		tran.commit();
		session.close();
		sf.close();
	}
	public void findProductById() {
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		System.out.println("Enter id for find");
		//Fetching the student object form the DB
		Product p=session.get(Product.class, sc.nextInt());

		if(p!=null) {
			System.out.println(p);
		}
		else {
			System.out.println("object not find");
		}
		tran.commit();
		session.close();
		sf.close();
	}
	public void updateProductByID() {

		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		//Fetching the Student object
		System.out.println("Enter a product Id : ");
		Product product=session.get(Product.class, sc.nextInt());

		if(product !=null) {
			int currentPrice=product.getProduct_Id();
			System.out.println("Enter the amout to be increse");
			int updatePrice=currentPrice+sc.nextInt();
			product.setProduct_Price(updatePrice);
			session.update(product);

			tran.commit();
			session.close();
			System.out.println("Product Object updated successfully");
		}
		else
			System.out.println("product not updated");


	}
	public void deleteProductById() {

		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		System.out.println("Enter ID");
		//Fetching the Student object
		Product p=session.get(Product.class, sc.nextInt());

		if(p!=null) {

			//updating the student object inside the DB
			session.delete(p);
			System.out.println("Product deleted successfully");
		}
		else {
			System.out.println("product not Present");
		}

		tran.commit();
		session.close();
		sf.close();
	}


}
