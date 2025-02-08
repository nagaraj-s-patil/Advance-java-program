package com.jsp.TutHibernete_OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         Configuration cnf=new Configuration().configure()
        		 .addAnnotatedClass(Questions.class).addAnnotatedClass(Answers.class);
         
         
         //question 1
         Questions q=new Questions();
         Answers a=new Answers();
         q.setQuestionId(1);
         q.setQuestion("what is java");
         
         //answer 1
        
         a.setAnswerId(101);
         a.setAnswer("java is a programing langu");
         q.setAnswers(a);
         
         //question 2
         Questions q2=new Questions();
         Answers a2=new Answers();
         q2.setQuestionId(2);
         q2.setQuestion("what is variable");
         
//         ansers 2
        
         a2.setAnswerId(102);
         a2.setAnswer("variable is a contener its stros the data");
         
         q2.setAnswers(a2);
         
         
         SessionFactory sf=cnf.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tran=session.beginTransaction();
      
         
         session.save(a);
         session.save(a2);
         session.save(q);
         session.save(q2);
         
         
         
         
         
         tran.commit();
         session.clear();
         sf.close();
         
    }
}
