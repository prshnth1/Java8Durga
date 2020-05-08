package com.durgaSoft.section7.lecture61;

import java.util.function.BiFunction;

public class Example1 {
public static void main(String[] args) {
	BiFunction<String, Integer, Student> student = (name, rollnumber) -> new Student(name, rollnumber);	
	System.out.println(new Student("Student1", 1));
	System.out.println(student.apply("Student2", 2));
}
}

class Student{
	
	String name;
	Integer rollNumber;
	
	public Student(String name, Integer rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", RollNumber=" + rollNumber;
	}
	
	
	
	
}
