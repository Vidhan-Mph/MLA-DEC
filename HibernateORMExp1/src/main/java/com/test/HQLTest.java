package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class HQLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		//crate SessionFactory object
		SessionFactory sf = cfg.buildSessionFactory();
		
		//create Session object
		Session session = sf.openSession();
		
		//create transaction object
		Transaction t = session.beginTransaction();
		
		String hql="delete From Employee e where e.id=:id";
		Query query=session.createQuery(hql);
		query.setParameter("id",2);
		int row=query.executeUpdate();
		
		System.out.println(row+"Deleted Success");
//		List list=query.getResultList();
//		System.out.println(list);
		session.close();
	}

}
