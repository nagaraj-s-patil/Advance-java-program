package com.jsp.Hibernate_HQL;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CriteriaBuildr_Fetch {

	public static void main(String[] args) {
		
		Configuration cnf=new Configuration();
		SessionFactory sf=cnf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		
		
		//builder
		CriteriaBuilder cb= session.getCriteriaBuilder();
		
		
		//Query construction
		CriteriaQuery<Acter> cq=cb.createQuery(Acter.class);
		Root<Acter> root=cq.from(Acter.class);
		cq.select(root);
		//cq.where(cb.equal(root.get("acterId"), 101));
		
		cq.from(Acter.class);
		
		//Query execution
		Query<Acter> query=session.createQuery(cq);
		List<Acter>actors=query.list();
		for(Acter a:actors) {
			System.out.println(a);
		}
		
		tran.commit();
    	session.clear();
    	sf.close();
		
		
		
		
	}
}
