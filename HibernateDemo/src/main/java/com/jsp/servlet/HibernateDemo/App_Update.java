package com.jsp.servlet.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Update {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
				
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		
		//Fetching the Student object
		Student student=session.get(Student.class, 101);
		student.setStudentAge(60);
		student.setStudentMarks(40);
		
		//updating the student object inside the DB
		session.update(student);
		
		
		tran.commit();
		session.close();
		sf.close();
		
		
			
	}
	
}
