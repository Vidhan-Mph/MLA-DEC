package com.test;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

//entity class

@Entity
@Table(name = "employee111")
@NamedQueries({@NamedQuery(name="customquery",query="from Employee e where e.emp_name=:emp_name")})
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
	@Override
	public String toString() {
		return String.format("Employee [id=%s, emp_name=%s, emp_cmp=%s, emp_salary=%s]", id, emp_name, emp_cmp,
				emp_salary);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String emp_name;
	
	private String emp_cmp;
	
	private double emp_salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_cmp() {
		return emp_cmp;
	}

	public void setEmp_cmp(String emp_cmp) {
		this.emp_cmp = emp_cmp;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
}
