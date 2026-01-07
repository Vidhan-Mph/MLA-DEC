package com.test;
 
import java.util.Arrays;
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class TestMappings {
 
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Address adr1 = new Address();
		adr1.setCity("Mumbai");
		adr1.setState("maharashtra");
		adr1.setCountry("india");
		
		Address adr2 = new Address();
		adr2.setCity("Pune");
		adr2.setState("maharashtra");
		adr2.setCountry("India");
		
		Address adr3 = new Address();
		adr3.setCity("Walsall");
		adr3.setState("Birmingham");
		adr3.setCountry("London");
		
		List<Address> adr = Arrays.asList(adr1, adr2, adr3);
		
//		Employee emp = new Employee();
//		emp.setE_name("Jay");
//		emp.setCmp("Mphasis");
//		emp.setAddress(adr);
		
		Student std = new Student();
		std.setStd_name("Riddhi");
		std.setAddresses(adr);
		
		session.persist(adr1);
		session.persist(adr2);
		session.persist(adr3);
		session.persist(std);
		
		t.commit();
		System.out.println("Done.");
		session.close();
	}
 
}
 
 