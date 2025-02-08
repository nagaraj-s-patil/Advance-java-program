package com.jsp.TutHibernetCodeForCompany;

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
        
    	Configuration cnf=new Configuration().configure().addAnnotatedClass(Company.class).addAnnotatedClass(Employe.class);
    	SessionFactory sf=cnf.buildSessionFactory();
    	Session session=sf.openSession();
    	
    	Transaction tran=session.beginTransaction();
    	
    	Company c=new Company();
    	Employe e=new Employe();
    	Employe e2=new Employe();
    	
    	
    	
    	e.setEmployeId(1);
    	e.setEmployeName("Nagu");
    	
    	e2.setEmployeId(2);
    	e2.setEmployeName("mallu");
    	
    	
    	c.setCompanyId(101);
    	c.setCompanyName("TCS");
    	
    	List<Employe>emps= new ArrayList<>();
    	emps.add(e); emps.add(e2);
    	
    	c.setEmployess(emps);
    	
    	session.save(e);
    	session.save(e2);
    	session.save(c);
    	
    	tran.commit();
    	session.close();
    	sf.close();
    	
    }
}
