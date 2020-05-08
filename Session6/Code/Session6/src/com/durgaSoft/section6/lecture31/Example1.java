package com.durgaSoft.section6.lecture31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {

		String[] names = {"Sunny", "Kajol", "Mallika", "Katrina", "Kareena"};
		Predicate<String> nameStartWithK = name -> name.startsWith("K");
		
		for (String name : names) {
			if(nameStartWithK.test(name)) {
				System.out.println(name);
			}
		}
		
	}

}
