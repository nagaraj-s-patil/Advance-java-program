package com.jsp.Hibernate_jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Hibernate_jpa.entity.Car;

public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
    	EntityManager em=emf.createEntityManager();
    	EntityTransaction et=em.getTransaction();
    	
    	Car car1=new Car();
    	car1.setCarId(1);
    	car1.setBrand("Maruti");
    	car1.setCarModel("Omni");
    	car1.setColor("red");
    	car1.setPrice(400000);
    	
    	
    	
    	et.begin();
    	//em.persist(car1);
    	Car car=em.find(Car.class, 1);
    	System.out.println(car);
    	et.commit();
    	em.close();
    	emf.close();
    }
}
