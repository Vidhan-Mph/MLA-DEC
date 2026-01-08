package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class NamedQueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create configuration object
				Configuration cfg = new Configuration();
				
				cfg.configure("hibernate.cfg.xml");
				
				//crate SessionFactory object
				SessionFactory sf = cfg.buildSessionFactory();
				
				//create Session object
				Session session = sf.openSession();
				
				//create transaction object
				Transaction t = session.beginTransaction();
			Query query=session.createNamedQuery("customquery");
				query.setParameter("emp_name","Rohit");
				List<Employee> emp=query.getResultList();
//				Query query=session.createNamedQuery("customquery");
//				query.setParameter("name","")
				System.out.println("Named Query Result");
				System.out.println(emp);
				session.close();
				
	}

} 
