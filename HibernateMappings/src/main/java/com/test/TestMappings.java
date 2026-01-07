package com.test;


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

//		Address adr1 = new Address();
//		adr1.setCity("Mumbai");
//		adr1.setState("maharashtra");
//		adr1.setCountry("india");
//		
//		Address adr2 = new Address();
//		adr2.setCity("Pune");
//		adr2.setState("maharashtra");
//		adr2.setCountry("India");
//		
//		Address adr3 = new Address();
//		adr3.setCity("Walsall");
//		adr3.setState("Birmingham");
//		adr3.setCountry("London");
//		
//		List<Address> adr = Arrays.asList(adr1, adr2, adr3);

//		 Department eng = new Department("Engineering");
//		 Department hr  = new Department("HR");

//		Employee emp = new Employee();
//		emp.setE_name("Jay");
//		emp.setCmp("Mphasis");
//		emp.setAddress(adr);
//		
//		Student std = new Student();
//		std.setStd_name("Riddhi");
//		std.setAddresses(adr);
//		
//		session.persist(adr1);
//		session.persist(adr2);
//		session.persist(adr3);
//		session.persist(std);

//		 session.persist(eng);
//		        session.persist(hr);

		Project phoenix = new Project("Phoenix");
		Project atlas = new Project("Atlas");
		Project nebula = new Project("Nebula");

		session.persist(phoenix);
		session.persist(atlas);
		session.persist(nebula);

		// Create Employees
		Employee jay = new Employee("Jay Manek", "Mphasis");
		Employee riddhi = new Employee("Riddhi Patel", "Mphasis");
		Employee alex = new Employee("Alex Singh", "Mphasis");

		// Associate (Many-to-Many)
		jay.addProject(phoenix);
		jay.addProject(atlas);

		riddhi.addProject(atlas);
		riddhi.addProject(nebula);

		alex.addProject(phoenix);

		// Persist employees (projects are already persisted)
		session.persist(jay);
		session.persist(riddhi);
		session.persist(alex);

		t.commit();
		System.out.println("Done.");
		session.close();
	}

}
