package com.durgaSoft.section2.lecture19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int eNumber;
	String eName;
	
	public Employee(int eNumber, String eName) {
		// TODO Auto-generated constructor stub
		this.eNumber=eNumber;
		this.eName= eName;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nEmployee Number "+this.eNumber+" "+"Employee Name "+this.eName;
	}
}



public class Example1 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(200,"Emp200");
		Employee emp2 = new Employee(400,"Emp400");
		Employee emp3 = new Employee(300,"Emp300");
		Employee emp4 = new Employee(100,"Emp100");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1); employees.add(emp2);
		employees.add(emp3); employees.add(emp4);
      
		System.out.println("Before Sorting "+employees);	
		Comparator<Employee> customComparator = (employee1, employee2) ->  -(employee1.eNumber - employee2.eNumber);
		
		employees.sort(customComparator);
		System.out.println("After Sorting "+employees);

	}
}
