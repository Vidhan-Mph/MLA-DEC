package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
		
		//create configuration object
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		//crate SessionFactory object
		SessionFactory sf = cfg.buildSessionFactory();
		
		//create Session object
		Session session = sf.openSession();
		
		//create transaction object
		Transaction t = session.beginTransaction();
		
		//create persistent object
		Employee emp = new Employee();
		
		emp.setEmp_name("Vidhan");
		emp.setEmp_cmp("Space X");
		emp.setEmp_salary(1000000000);
		
		//storing the persistent object into database
//		session.persist(emp);
		
		//commit the data
		
//		t.commit();
		Employee dt=session.get(Employee.class, 52);
				System.out.println(dt.getId()+""+dt.getEmp_name()+""+dt.getEmp_cmp() );
	
				
				
				
				
				
				
				
				
				
				
				
				.
				dt.setEmp_cmp("Microsoft");
				dt.setEmp_name("ishita");
				dt.setEmp_salary(2000000);
				//session.persist(dt);
				session.remove(dt);
				t.commit();
		System.out.println("Done.");
		
		//close the session object
		session.close();
		
	}
}
