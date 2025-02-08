package com.jsp.servlet.Hibernate_manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      
    	Product p1=new Product();
    	Product p2=new Product();
    	
    	p1.setProductId(1);
    	p1.setProductName("laptop");
    	p2.setProductId(2);
    	p2.setProductName("mobile");
    	
    	Custemer c1=new Custemer();
    	Custemer c2=new Custemer();
    	c1.setCustemerId(101);
    	c1.setCustemerName("Sanket");
    	c2.setCustemerId(102);
    	c2.setCustemerName("sachin");
    	
    	List<Product>plist=new ArrayList<Product>();
    	
    	plist.add(p1);
    	plist.add(p2);
    	
    	c1.setProducts(plist);
    	c2.setProducts(plist);
    	
    	
    	
    	Configuration cnf=new Configuration().configure()
    			.addAnnotatedClass(Product.class)
    			.addAnnotatedClass(Custemer.class);
    	SessionFactory sf=cnf.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tran=session.beginTransaction();
    	
    	
    	
    	session.save(c1);
    	session.save(c2);
    	session.save(p1);
    	session.save(p2);
    	
    	
    	tran.commit();
		session.close();
		sf.close();
    	
    }
}
