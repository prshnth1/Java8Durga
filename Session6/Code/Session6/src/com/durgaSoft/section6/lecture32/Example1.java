package com.durgaSoft.section6.lecture32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {

		String[] names = { "Durga", " ", null, "Ravi", "", "Shiva", null };
		Predicate<String> toRemoveNullAndEmpty = name -> name != null && ! (name.trim().isEmpty());
		ArrayList<String> namesList = new ArrayList<String>();
		
		for ( String name : names) {
			if(toRemoveNullAndEmpty.test(name)) {
				System.out.println("Name "+name);
				namesList.add(name);
			}
		}
		
		System.out.println(namesList);
	}

}
