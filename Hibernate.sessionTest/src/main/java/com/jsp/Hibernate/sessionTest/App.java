package com.jsp.Hibernate.sessionTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cnf=new Configuration().configure().addAnnotatedClass(Employe.class);
		SessionFactory sf=cnf.buildSessionFactory();
		Session session1=sf.openSession();
		Transaction tran1=session1.beginTransaction();
		
		Employe empl1=new Employe();
		empl1.setEmployeId(101);
		empl1.setEmployePhNo(272733748);
		empl1.setEmployeName("sankit");
		
		session1.save(empl1);
		
		Employe empl2=new Employe();
		empl2.setEmployeId(102);
		empl2.setEmployePhNo(48957439);
		empl2.setEmployeName("vilash");
		session1.save(empl2);
		
		

		Employe emp1=session1.get(Employe.class, 101);
		System.out.println(emp1);
		Employe emp2=session1.get(Employe.class, 102);
		System.out.println(emp2);

		tran1.commit();
		session1.close();

		Session session2=sf.openSession();
		Transaction tran2=session2.beginTransaction();

		Employe emp3=session2.get(Employe.class, 101);
		System.out.println(emp3);
		Employe emp4=session2.get(Employe.class, 102);
		System.out.println(emp4);


		tran2.commit();
		session2.close();


	}
}
