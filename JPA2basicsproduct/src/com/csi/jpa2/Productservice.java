package com.csi.jpa2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Entity;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Productservice {
 private static SessionFactory factory;
  
  public static void main(String[] args) {
     factory=new AnnotationConfiguration().configure().buildSessionFactory();
     Session session=factory.openSession();
     Transaction transaction=session.beginTransaction();
    
     Productcon pp=new Productcon();
    // pp.setProdId(1);
     pp.setProdName("OPPO");
     pp.setProdprice(55000);
   session.save(pp);
   transaction.commit();
	}

}
