package com.durgaSoft.section7.lecture81;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
public static void main(String[] args) {
	ArrayList<Integer> intList = new ArrayList<Integer>();
	intList.add(0); intList.add(10); intList.add(20);intList.add(5);intList.add(15);intList.add(25);
	System.out.println(intList);
	
	//calculate minimum value
	Comparator<Integer> defaultNaturalSortingOrder = (number1, number2) -> number1.compareTo(number2);
	Integer minimumValue = intList.stream().sorted().min(defaultNaturalSortingOrder).get();
	System.out.println("Minimum value "+ minimumValue);
	
	//calculating max value
	Integer maximumValue = intList.stream().sorted().max(defaultNaturalSortingOrder).get();
	System.out.println("Maximum Value "+maximumValue);
}
}
