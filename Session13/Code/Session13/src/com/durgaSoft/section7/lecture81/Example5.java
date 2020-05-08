package com.durgaSoft.section7.lecture81;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(0); intList.add(10); intList.add(20);intList.add(5);intList.add(15);intList.add(25);
		System.out.println(intList);
		
		//default sorting order
		List<Integer> sortedIntList=intList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedIntList);
		
		//reverse sorting order
		Comparator<Integer> reverseSorting = (number1, number2) -> -(number1.compareTo(number2));
		List<Integer> custSortedIntList = intList.stream().sorted(reverseSorting).collect(Collectors.toList());
		System.out.println(custSortedIntList);
	}
}
