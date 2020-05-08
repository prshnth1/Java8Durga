package com.durgaSoft.section6.lecture28;

import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		Predicate<Integer> checkGreaterThan10 = i->i>10;
	
		System.out.println(checkGreaterThan10.test(1));
		System.out.println(checkGreaterThan10.test(12));
		
		//We will get Incompatible type error
		//System.out.println(checkGreaterThan10.test("Prashanth"));
		
	}	
	
}
