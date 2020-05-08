package com.durgaSoft.section6.lecture30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		int[] number = {20,1,34,5,6,47,78,49,10};

		Predicate<Integer> greaterThan10 	= num -> num >10;
		Predicate<Integer> evenNumber		= num -> (num%2) == 0;
	
		for (int i : number) {
			System.out.println("Greater Than 10 "+i+" "+greaterThan10.test(i));
			System.out.println("Even Number     "+i+" "+evenNumber.test(i));
			System.out.println(">10 and Even    "+i+" "+greaterThan10.and(evenNumber).test(i));
			System.out.println("<10 or Even    "+i+" "+greaterThan10.negate().or(evenNumber).test(i));		
		}
	}

}
