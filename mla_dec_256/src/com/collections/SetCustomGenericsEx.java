package com.collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	@Override
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
	
}

class NameSorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class SetCustomGenericsEx {

	public static void main(String[] args) {
		
//		HashSet<Employee> data = new HashSet<>();
		
		TreeSet<Employee> data = new TreeSet<>(new NameSorting());
		data.add(new Employee(100, "Jay", 35000));
		data.add(new Employee(101, "Riddhi", 50000));
		data.add(new Employee(202, "Vidhan", 20000));
		data.add(new Employee(104, "Ishita", 15000));
		data.add(new Employee(302, "Akash", 30000));
		data.add(new Employee(301, "Parth", 25000));
		
//		data.forEach(System.out::println);
		
//		Consumer<Employee> csmr = System.out::println; //object stream 
//		System.out.println(csmr);
//		data.forEach(csmr);
		
//		System.out.println(data.size());
		
		Predicate<Employee> prdt = x->x.getSalary()>20000; //boolean valued function
		System.out.println(prdt);
		
		System.out.println(data.stream().filter(prdt).toList());
		
		

	}

}
