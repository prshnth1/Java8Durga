package com.durgaSoft.section7.lecture40.example6;

import java.util.ArrayList;
import java.util.function.Function;

public class Example6 {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();		
		pupulateEmployee(empList);
		
		Function<ArrayList<Employee>, Double> monthlySalaryCal = employeeList -> {
			double totalSalary =0;
			for (Employee employee : empList) {
				totalSalary = employee.salary + totalSalary;
			}
			return totalSalary;
		};
		
		System.out.println("Total Salary "+monthlySalaryCal.apply(empList));
	}

	private static void pupulateEmployee(ArrayList<Employee> employee) {
		// TODO Auto-generated method stub
		employee.add(new Employee("Sunny", 1000));
		employee.add(new Employee("Bunny", 2000));
		employee.add(new Employee("Chinny", 3000));
		employee.add(new Employee("Pinny", 4000));
		employee.add(new Employee("Vinny", 5000));
	}
}
