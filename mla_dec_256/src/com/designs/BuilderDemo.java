package com.designs;
class Employee{
	
	private int id;
	private String name;
	private String empType;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmpType() {
		return empType;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empType=" + empType + "]";
	}
	
}


interface EmpBuilder{
	void empDetails();
	void empType();
}

class ImplBuilder implements EmpBuilder{
	private Employee emp = new Employee();
	@Override
	public void empDetails() {
		
		emp.setId(101);
		emp.setName("Jay");
	}

	@Override
	public void empType() {
		emp.setEmpType("REGULAR");
		
	}
	
	public Employee employeeData() {
		return emp;
	}
}

class BuilderTest{
	public void employeeInfo(EmpBuilder builder) {
		builder.empDetails();
		builder.empType();
	}
}

public class BuilderDemo {
	public static void main(String[] args) {
		ImplBuilder empObj = new ImplBuilder();
		BuilderTest testObj = new BuilderTest();
		
		testObj.employeeInfo(empObj);
		System.out.println(empObj.employeeData());
		
	}
}
