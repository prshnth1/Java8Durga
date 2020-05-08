package com.durgaSoft.section7.lecture67;

import java.util.function.Predicate;

public class Example1 {
public static void main(String[] args) {
	
	int[] integerNumbers = {0,5,10,15,20,25};
	Predicate<Integer> checkEvenNumber = x -> x%2==0;
	
	for (int i : integerNumbers) {
		if(checkEvenNumber.test(i)) {
			System.out.println(i);
		}
	}
	
}
}
