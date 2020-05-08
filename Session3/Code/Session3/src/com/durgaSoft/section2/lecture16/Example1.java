package com.durgaSoft.section2.lecture16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(0);
		numbers.add(15);
		numbers.add(5);
		numbers.add(20);
		System.out.println("Before sorting "+numbers);
		numbers.sort((num1, num2) -> -(num1-num2));
		System.out.println("After sorting "+numbers);
		
		}	
	
}

