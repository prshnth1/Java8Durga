package com.durgaSoft.section6.lecture35;

public class Employee {

	String name;
	String designation;
	double salary;
	String city;
	
	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city;
	}
	
	
	
	
}
