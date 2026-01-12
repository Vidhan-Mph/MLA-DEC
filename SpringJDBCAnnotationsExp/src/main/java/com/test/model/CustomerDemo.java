package com.test.model;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.CustomerDao;


public class CustomerDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);

	    CustomerDao cdao = ctx.getBean( CustomerDao.class);
	    
	    Customer c1=new Customer(2,"Vidhan","Mysuru","Karnataka");
//	    c1.setC_name("Vidhan");
//	    c1.setC_city("Mysuru");
//	    c1.setC_state("Karnataka");
	   // c1.setId(2);
	    
	    
	    
 cdao.updateCustomer(c1);
	   // cdao.deleteCustomer(c1);
//	    List<Customer> listCustomers=cdao.getAllCustomers();
//	    listCustomers.forEach(System.out::println);
	    
}
}