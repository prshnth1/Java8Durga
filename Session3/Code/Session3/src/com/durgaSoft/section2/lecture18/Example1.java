package com.durgaSoft.section2.lecture18;

import java.util.Comparator;
import java.util.TreeMap;

public class Example1 {
	public static void main(String[] args) {
		Comparator<Integer> myComparator = (num1, num2) -> -(num1 - num2);
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(myComparator);
		treeMap.put(10, "Ten");
		treeMap.put(0, "Zero");
		treeMap.put(15, "Fifteen");
		treeMap.put(5, "Five");
		treeMap.put(20, "Twenty");
		System.out.println(treeMap);

	}
}