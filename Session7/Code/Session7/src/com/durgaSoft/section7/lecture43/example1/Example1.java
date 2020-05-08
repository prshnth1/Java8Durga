package com.durgaSoft.section7.lecture43.example1;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		pupulateEmployee(empList);
		Predicate<Employee> salaryCheck = emp -> emp.salary < 3500;

		Function<Employee, Employee> empSalIncrement = employee -> {
			employee.salary = employee.salary + 477;
			return employee;
		};

		for (Employee employee : empList) {
			if (salaryCheck.test(employee)) {
				empSalIncrement.apply(employee);
			}
		}

		System.out.println(empList);
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
