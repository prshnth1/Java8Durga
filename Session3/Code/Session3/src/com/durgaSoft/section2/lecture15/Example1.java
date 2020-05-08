package com.durgaSoft.section2.lecture15;

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
		MyComparator myComparator = new MyComparator();
		numbers.sort(myComparator);
		System.out.println("After sorting "+numbers);
		
		}	
	
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -(o1-o2);
	}
	
}
