package com.durgaSoft.section2.lecture17;

import java.util.Comparator;
import java.util.TreeSet;



public class Example1 {
	public static void main(String[] args) {
		Comparator<Integer> myComparator = (num1, num2 ) -> -(num1-num2);
		TreeSet<Integer> treeSet = new TreeSet<Integer>(myComparator);
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(25);
		treeSet.add(5);
		treeSet.add(20);
		System.out.println(treeSet);
		}	
	
}
