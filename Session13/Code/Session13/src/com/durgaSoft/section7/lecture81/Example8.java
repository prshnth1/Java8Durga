package com.durgaSoft.section7.lecture81;

import java.util.ArrayList;

public class Example8 {
public static void main(String[] args) {
	ArrayList<Integer> intList = new ArrayList<Integer>();
	intList.add(0); intList.add(10); intList.add(20);intList.add(5);intList.add(15);intList.add(25);
	
	Integer[] numbers = intList.stream().toArray(Integer[]::new);
	
	for (Integer integer : numbers) {
		System.out.println(integer);
	}
}
}
