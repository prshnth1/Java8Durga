package com.durgaSoft.section7.lecture67;

import java.util.function.Function;

public class Example2 {
public static void main(String[] args) {
	
	int[] integerNumbers = {0,5,10,20,25};
	
	Function<Integer, Integer> square = number -> number *number;
	
	for (int i : integerNumbers) {
		System.out.println(square.apply(i));
	}
	
}
}
