package com.durgaSoft.section7.lecture62;

import java.util.function.BiFunction;

public class Example1 {
public static void main(String[] args) {

	BiFunction<Employee, TimeSheet, Double> calculateWage = (employee,timeSheet) -> employee.dailyWage * timeSheet.days;
	System.out.println(calculateWage.apply(new Employee(01,"Emp1",800), new TimeSheet(01, 30)));
}
}

class TimeSheet{
	
	int employeeNumber;
	int days;
	
	@Override
	public String toString() {
		return "EmployeeNumber=" + employeeNumber + ", Days=" + days;
	}

	public TimeSheet(int employeeNumber, int days) {
		super();
		this.employeeNumber = employeeNumber;
		this.days = days;
	}
	
}

class Employee{
	
	int employeeNumber;
	String name;
	double dailyWage;	
	
	public Employee(int employeeNumber, String name, double dailyWage) {
		super();
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.dailyWage = dailyWage;
	}


	@Override
	public String toString() {
		return "EmployeeNumber=" + employeeNumber + ", Name=" + name + ", DailyWage=" + dailyWage;
	}
	
	
}
