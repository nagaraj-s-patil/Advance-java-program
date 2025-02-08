package com.jsp.servlet.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Fetch {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		
		//Fetching the student object form the DB
		Student student=session.get(Student.class, 102);
		System.out.println(student);
		
		tran.commit();
		session.close();
		sf.close();
	}
}
