package com.jsp.servlet.Hibernate_MayToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cnf=new Configuration().configure().addAnnotatedClass(Company.class).addAnnotatedClass(Employees.class);
        
        SessionFactory sf=cnf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tran=session.beginTransaction();
        
        Company c=new Company();
        c.setCompanyId(1);
        c.setCompanyName("tata");
        
        Employees e1=new Employees();
        Employees e2=new Employees();
        
        e1.setEmployeId(101);
        e1.setEmployeName("vilash");
        e1.setSalary(20000);
        
        e2.setEmployeId(102);
        e2.setEmployeName("sanket");
        e2.setSalary(100000);
        
        //adding company to employees
        
        e1.setCompany(c);
        e2.setCompany(c);
       
        session.save(c);
        session.save(e1);
        session.save(e2);
        
        
        
        
        
        tran.commit();
        session.close();
        sf.close();
        
        
    }
}
