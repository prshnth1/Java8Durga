package com.durgaSoft.section7.lecture40.example4;

import java.util.ArrayList;
import java.util.function.Function;

/*
 * Print student Grade
 * */

public class Example4 {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		addStudent(studentList);

		Function<Student, String> markSegregation = student -> {
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
		
		for (Student student : studentList) {
			System.out.println(markSegregation.apply(student));
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
