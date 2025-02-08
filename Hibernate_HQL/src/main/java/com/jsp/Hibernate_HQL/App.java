package com.jsp.Hibernate_HQL;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cnf=new Configuration().configure()
    			.addAnnotatedClass(Acter.class);
    	SessionFactory sf=cnf.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tran=session.beginTransaction();
    	
    	//Fetch operation
    	
//    	Query<Acter> query=session.createQuery("from Acter");
//    	List<Acter> actors=query.list();
//    	for(Acter acter:actors) {
//    		System.out.println(acter);
//    	}
    	
//    	//Update Operation
//    	Query<Acter> query=session.createQuery("update Actor a set a.ActerAge=?1 whele a.acterId=id");
//    	query.setParameter(1, 102);
//    	query.setParameter("id", 108);
//    	int rowUpdated=query.executeUpdate();
//    	System.out.println(rowUpdated);
    	
    	//petch Operation
//    	NativeQuery<Acter> nativequery =session.createNativeQuery("select * from  acter",Acter.class);
//    	List<Acter> actors=nativequery.list();
//    	
//    	for(Acter actor:actors) {
//    		System.out.println(actor);
//    	}
    	
//    	update operation
//    	NativeQuery<Acter> nativequery =session.createNativeQuery(
//    			"Update acter set ActerAge=:age where acterId=:id",Acter.class);
//    	nativequery.setParameter("age", 30);
//    	nativequery.setParameter("id", 101);
//    	int rowsUpdated=nativequery.executeUpdate();
//    	
//    	System.out.println(rowsUpdated+" data Updated !");
    	
    	//Delete Operation
//    	NativeQuery<Acter> nativeQuery=session.createNativeQuery(
//    			"Delete from acter where acterName=?1",Acter.class);
//    	nativeQuery.setParameter(1, "darshan ");
//    	int rowsDeleted=nativeQuery.executeUpdate();
//    	System.out.println(rowsDeleted+" data deleted ! ");
//    	 	
//    	
    
    	//criteria 
//    	Criteria criteria=session.createCriteria(Acter.class);
//    	List<Acter> acters=criteria.list();
//    	
//    	for(Acter actor :acters){
//    		System.out.println(actor);
//    	}
    	
//    	criteria add
//    	
//    	Criteria criteria=session.createCriteria(Acter.class);
//    	criteria.add(Restrictions.eq("ActerId", 101));
//    	criteria.add(Restrictions.gt("acterId", 101));
//    	
    	
    	Criteria criteria=session.createCriteria(Acter.class);
    	
    	criteria.setProjection(Projections.property("acterName"));
    	List<String>actors=criteria.list();
    	
    	for(String a:actors) {
    		System.out.println(a);
    	}
    	
    	tran.commit();
    	session.clear();
    	sf.close();
    	
    		
    }
}
