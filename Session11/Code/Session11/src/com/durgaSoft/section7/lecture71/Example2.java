package com.durgaSoft.section7.lecture71;

import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;

public class Example2 {
public static void main(String[] args) {
	//old example
	BiConsumer<Employee, Double> empIncrement1 = (emp,increment)-> emp.salary=emp.salary+increment; 
	ObjDoubleConsumer<Employee> empIncrement2 =  (emp,increment)-> emp.salary=emp.salary+increment;
	
	Employee employee1 =new Employee("Employee1", 1000.0);
	Employee employee2 =new Employee("Employee2", 500.0);

	System.out.println("Employee before increment "+employee1);
	System.out.println("Employee before increment "+employee2);
	
	empIncrement1.accept(employee1, 100.0);
	empIncrement2.accept(employee2, 10);
	

	System.out.println("Employee after increment "+employee1);
	System.out.println("Employee after increment "+employee2);
	
	
	System.out.println();
	
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