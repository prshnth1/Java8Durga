package com.durgaSoft.section7.lecture64;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Example1 {
public static void main(String[] args) {
	
	BiFunction<String, Double, Employee> employeeObject = (empName, salary) -> new Employee(empName, salary);
	BiConsumer<Employee, Double> employeeIncrement = (employee, increment) -> employee.salary=employee.salary+increment; 
	
	
	ArrayList<Employee> employeeList=new ArrayList<Employee>();	
	employeeList.add(employeeObject.apply("Durga", 1000.0));
	employeeList.add(employeeObject.apply("Sunny", 2000.0));
	employeeList.add(employeeObject.apply("Bunny", 3000.0));
	employeeList.add(employeeObject.apply("Chinny", 4000.0));
	
	for (Employee employee : employeeList) {
		System.out.println(employee);
	}
	
	for (Employee employee : employeeList) {
		employeeIncrement.accept(employee, 100.0);
	}
	
	
	for (Employee employee : employeeList) {
		System.out.println(employee);
	}
}
}

class Employee{
	
	String name;
	double salary;
	
	
	@Override
	public String toString() {
		return "Name=" + name + ", Salary=" + salary;
		
	}
	
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}