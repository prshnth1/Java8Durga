package com.durgaSoft.section6.lecture36;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Prashanth"); 		list.add("I");
		list.add("am");		list.add("all");
		list.add("alone");
		
		Predicate<String> predicateEquals = Predicate.isEqual("alone");
		for (String string : list) {
			if(!predicateEquals.test(string))
				System.out.println(string);
		}
	}
}
