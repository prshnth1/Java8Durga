package com.durgaSoft.section7.lecture79;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
public static void main(String[] args) {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(0); list1.add(10); list1.add(20); 
	list1.add(5); list1.add(15); list1.add(25); 
	
	List<Integer> list2 = list1.stream().filter(number -> number%2==0).collect(Collectors.toList());
	System.out.println(list1);
	System.out.println(list2);
	
}
}
