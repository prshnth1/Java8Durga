package com.durgaSoft.section7.lecture68;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Example1 {
public static void main(String[] args) {
	int[] integerNumbers = {0,5,10,15,20,25};
	IntPredicate checkEvenNumber = x -> x%2==0;
	
	for (int i : integerNumbers) {
		if(checkEvenNumber.test(i)) {
			System.out.println(i);
		}
	}
}
}
