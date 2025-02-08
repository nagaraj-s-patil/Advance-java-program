package com.jsp.servlet.HibernateDemo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Insert
{
	public static void main( String[] args )
	{

		Student student=new Student();
		student.setStudentId(103);
		student.setStudentName("sanket");
		student.setStuddebtEmail("sk@gmail.com");
		student.setStudentAge(24);
		student.setStudentMarks(99);

		Configuration cfg= new Configuration();

		cfg.configure();

		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf=cfg.buildSessionFactory();

		Session session=sf.openSession();

		Transaction tran=session.beginTransaction();

		session.save(student);


		tran.commit();
		session.close();
		sf.close();

	}
}
