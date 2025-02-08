package com.jsp.Hibernet_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{

		
		
		Configuration cnf=new Configuration().configure()
				.addAnnotatedClass(Person.class).addAnnotatedClass(Aadhar.class);
		
		SessionFactory sf=cnf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		
		
		Person  p1=new Person();
		Aadhar a1=new Aadhar();
		
		a1.setAadharId(100);
		a1.setAadharNo(991122334);
		
		p1.setPersonId(1);
		p1.setPersonName("sanket");
		p1.setAadhar(a1);
		
		session.save(a1);
		session.save(p1);
		
		tran.commit();
		session.close();
		sf.close();
		
		

	}

}
