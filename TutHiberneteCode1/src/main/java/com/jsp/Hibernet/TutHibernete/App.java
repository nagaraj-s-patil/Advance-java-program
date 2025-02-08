package com.jsp.Hibernet.TutHibernete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      
    	Configuration cnf=new Configuration().configure()
    			.addAnnotatedClass(Student.class);
    	
    	SessionFactory sf=cnf.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction trans=session.beginTransaction();
    	
    	Student s=new Student(1, "nagaraj", "gulbarga");
    	
    	System.out.println(s);
    	
    	session.save(s);
    	trans.commit();
    	session.close();
    	sf.close();
    	
    	
    	
    	
    }
}
