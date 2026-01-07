package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String e_name;

	private String cmp;

//	// Many employees belong to one department
//	    @ManyToOne(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "department_id")
//	    private Department department;

	// Many-to-Many: owning side on Employee
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "employee_project", joinColumns = @JoinColumn(name = "employee_id"))
	private Set<Project> projects = new LinkedHashSet<>();

	public Employee(String e_name, String cmp) {
		this.e_name = e_name;
		this.cmp = cmp;
	}

	public void addProject(Project p) {
		projects.add(p);
	}

	public void removeProject(Project p) {
		projects.remove(p);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

//	public Department getDepartment() { return department; }
//    public void setDepartment(Department department) { this.department = department; }

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", e_name=" + e_name + ", cmp=" + cmp + "]";
	}

}
