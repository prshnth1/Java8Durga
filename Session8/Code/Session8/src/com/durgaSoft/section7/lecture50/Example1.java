package com.durgaSoft.section7.lecture50;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;




public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		addStudent(studentList);
		
		Function<Student, String> gradeStudent = student -> {
			if(student.marks >80 )
				return "A[Distinction]";
			else if (student.marks>=60) {
				return "B[First Class]"; 
			}else if (student.marks>=50) {
				return "C[Second Class]"; 
			}else if (student.marks>=35) {
				return "D[Third Class]"; 
			}else {
				return "E[Failed]";
			}
		};
		
		Predicate<Student> conditionCheck = student -> student.marks > 60;
		Consumer<Student> displayStudent = student -> System.out.println(student);
		
		for (Student student : studentList) {
			if(conditionCheck.test(student)) {
				System.out.print(gradeStudent.apply(student)+" ");
				displayStudent.accept(student);
			}
			
			
		}
		
	}
	
	private static void addStudent(ArrayList<Student> studentList) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Sunny", 100);
		Student student2 = new Student("Bunny", 65);
		Student student3 = new Student("Chinny", 55);
		Student student4 = new Student("Vinny", 45);
		Student student5 = new Student("Pinny", 25);

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
	}
}

class Student {
	String name;
	int  marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "name=" + name + ", marks=" + marks;
	}	
	
	
	
}

