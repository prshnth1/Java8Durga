package com.durgaSoft.section7.lecture79;

import java.util.ArrayList;

/*
 *To get filter a list of even numbers  
 * 
 */

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(0); list1.add(10); list1.add(20); 
		list1.add(5); list1.add(15); list1.add(25); 
				
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for (Integer integer : list1) {
			
			if((integer%2)==0) {
				list2.add(integer);
			}
		}
		
		System.out.println(list1);
		System.out.println(list2);
	}
}
