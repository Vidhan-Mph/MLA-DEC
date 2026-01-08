package com.test;

import java.awt.print.Book;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CrieteriaTest {

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
		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee>cq=cb.createQuery(Employee.class);
		cq.distinct(true);
		Root<Employee> rt=cq.from(Employee.class);
		cq.select(rt);
		
		TypedQuery<Employee> tq=session.createQuery(cq);
		
		List<Employee> emp=tq.getResultList();
		System.out.println(emp);
	}

}
