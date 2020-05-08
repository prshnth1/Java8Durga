package com.durgaSoft.section7.lecture81;

import java.util.ArrayList;

public class Example7 {
public static void main(String[] args) {
	ArrayList<Integer> intList = new ArrayList<Integer>();
	intList.add(0); intList.add(10); intList.add(20);intList.add(5);intList.add(15);intList.add(25);
	System.out.println(intList);
	
	intList.stream().forEach(message -> System.out.println(message));
	System.out.println();
	
	//with methodReference
	intList.stream().forEach(System.out:: println);
	System.out.println();
}
}
