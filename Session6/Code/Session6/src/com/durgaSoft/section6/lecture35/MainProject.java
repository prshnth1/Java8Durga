package com.durgaSoft.section6.lecture35;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainProject {

	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeList();
		System.out.println("Employee list "+employeeList);
		
		System.out.println("*******************************************************");
		//To select all employees who are managers
		Predicate<Employee> empManager = emp -> emp.designation.equals("Manager");
		System.out.println("Employess who are managers");
		display(empManager,employeeList);		
		System.out.println("*******************************************************");
		
		//To Display all employees who are in Bangalore
		Predicate<Employee> empBangalore = emp -> emp.city.equals("Bangalore");
		System.out.println("Employess who are working in Bangalore");
		display(empBangalore,employeeList);		
		System.out.println("*******************************************************");
		
		//To Display all employees who's salary is less than 20,000
		Predicate<Employee> empSalary = emp -> emp.salary<20000; 
		System.out.println("Employess whos slary is less than 20,000");
		display(empSalary,employeeList);		
		System.out.println("*******************************************************");
		
		//To print out all the employees who are managers and are from Bangalore
		Predicate<Employee> empManagerBangalore = empManager.and(empBangalore);
		System.out.println("Employess who are managers and are from Bangalore");
		display(empManagerBangalore,employeeList);
		System.out.println("*******************************************************");
		
		//To print out all the employees who are managers or salary less than 20,000
		Predicate<Employee> empManagerSalary = empManager.or(empSalary);
		System.out.println("Employess who are managers or salary less than 20,000");
		display(empManagerSalary,employeeList);
		System.out.println("*******************************************************");
		
		//Employess who are not managers
		Predicate<Employee> empNotManager = empManager.negate();
		System.out.println("Employess who are not managers");
		display(empNotManager,employeeList);
		System.out.println("*******************************************************");
	}
	
	private static void display(Predicate<Employee> predicate, List<Employee> employeeList) {
		// TODO Auto-generated method stub
		for (Employee employee : employeeList) {
			if(predicate.test(employee)) {
				System.out.println(employee);
			}
		}
	}

	public static List<Employee> getEmployeList(){
		
		ArrayList<Employee> empArrayList = new ArrayList<Employee>();
		Employee emp1 = new Employee("Durga", "CEO", 30000,"Hyderbad");
		Employee emp2 = new Employee("Sunny", "Manager", 20000,"Hyderbad");
		Employee emp3 = new Employee("Mallika", "Manager", 20000,"Bangalore");
		
		Employee emp4 = new Employee("Kareena", "Lead", 15000,"Hyderbad");
		Employee emp5 = new Employee("Katrina", "Lead", 15000,"Bangalore");
		Employee emp6 = new Employee("Anushka", "Developer", 10000,"Hyderbad");
		
		Employee emp7 = new Employee("Kanushka", "Developer", 10000,"Hyderbad");
		Employee emp8 = new Employee("Sowmya", "Developer", 10000,"Bangalore");
		Employee emp9 = new Employee("Ramya", "Developer", 10000,"Bangalore");
		
		empArrayList.add(emp1); empArrayList.add(emp2); empArrayList.add(emp3);
		empArrayList.add(emp4); empArrayList.add(emp5); empArrayList.add(emp6);
		empArrayList.add(emp7); empArrayList.add(emp8); empArrayList.add(emp9);
		
		
		
		return empArrayList;
	}
}
