
package com.jsp.hibernete.shopping_cast.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.jsp.hibernete.shopping_cast.entity.Cart;
import com.jsp.hibernete.shopping_cast.entity.Product;
import com.jsp.hibernete.shopping_cast.entity.User;

public class ShoppingCastDao {
	Scanner sc=new Scanner(System.in);
	Configuration cnf=new Configuration().configure()
			.addAnnotatedClass(User.class).addAnnotatedClass(Product.class)
			.addAnnotatedClass(Cart.class);

	SessionFactory sf=cnf.buildSessionFactory();


	public void addProduct() {

		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		Product p=new Product();

		System.out.println("Enter product id");
		p.setProductID(sc.nextInt());

		System.out.println("Enter product Name");
		p.setProductName(sc.next());

		System.out.println("Enter product brand");
		p.setBrand(sc.next());

		System.out.println("Enter priduct Price");
		p.setPrice(sc.nextInt());

		session.save(p);
		tran.commit();
		session.close();
	}


	public void addUserWithCart() {
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		Product p=new Product();

		User u=new User();
		Cart c1=new Cart();
		System.out.println("enter id for user");
		u.setUserId(sc.nextInt());
		System.out.println("enter user name");
		u.setUserName(sc.next());
		System.out.println("Enter user phno");
		u.setMobile(sc.nextLong());
		System.out.println("Enter user email");
		u.setEmail(sc.next());
		System.out.println("Enter cart no");
		c1.setCartId(sc.nextInt());



		u.setCart(c1);

		session.save(u);
		tran.commit();
		session.close();

	}

	public void aadProductToUserCar() {

		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();

		System.out.println("Enter the product id");
		Product product=session.get(Product.class, sc.next());
		if(product!=null) {
			System.out.println("enter the user Id: ");
			User user=session.get(User.class, sc.next());
			if(user !=null) {
				Cart cart=user.getCart();
				List<Product> plist=cart.getProducts();
				plist.add(product);

				session.update(cart);

				tran.commit();
				session.clear();
				System.out.println("product Added to the Cart");
			}
			else {
				System.err.println("User not found bt Id");
			}
		}
		else {
			System.err.println("Product not found by id");
		}
	}


	public void removeProductFromUserCart() {
		
	}

	public void findAllProductInCart() {

		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();

		System.out.println("\nEnter the user Id:");
		User user=session.get(User.class, sc.next());
		if(user !=null) {
			Cart cart=user.getCart();
			List<Product> plist=cart.getProducts();
			System.out.println("All product Details");
			for(Product product:plist) {
				System.out.println(product);

				tran.commit();
				session.clear();
			}
		}
		else
			System.err.println("\nUser Not found by id :");

	}


}
