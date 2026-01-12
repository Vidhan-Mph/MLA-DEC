package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans.xml");

        EmployeeDao empdao = ctx.getBean("edao", EmployeeDao.class);
        
        Employee emp=new Employee();
        Employee emp1=new Employee(1,"Vidhan","Sydney","Mphasis");
        emp.setE_name("Ishita");
        emp.setE_city("Mumbai");
        emp.setE_cmp("Mphasis");
        empdao.insertEmployee(emp1);
       // empdao.updateEmployee(emp1);
        //empdao.createEmployee(emp);
       // empdao.deleteEmployee(emp1);
        
        
        //List<Employee>empdata=empdao.getAllEmployees();
       // System.out.println(empdata);
        System.out.println("Employee data updated");
	}

}
