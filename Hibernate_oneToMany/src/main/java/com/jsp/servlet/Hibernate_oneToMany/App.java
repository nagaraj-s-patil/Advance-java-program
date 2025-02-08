package com.jsp.servlet.Hibernate_oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       
    	Configuration cnf=new Configuration().configure().addAnnotatedClass(Employees.class).addAnnotatedClass(Company.class);
    	SessionFactory sf=cnf.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tran=session.beginTransaction();
    	
    	Employees e1=new Employees();
    	e1.setEmployeName("sanket");
    	e1.setEmployeId(1);
    	
    	Employees e2=new Employees();
    	e2.setEmployeId(2);
    	e2.setEmployeName("vilash");
    	
    	Company c=new Company();
    	c.setCompanyId(101);
    	
    	
    	session.save(c);
		session.save(e1);
		session.save(e2);


		tran.commit();
		session.close();
		sf.close();
    	
    	
    	
    }
}
