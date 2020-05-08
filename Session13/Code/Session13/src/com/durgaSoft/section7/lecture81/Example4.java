package com.durgaSoft.section7.lecture81;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Pavan");
		namesList.add("Raviteja");
		namesList.add("Chiranjivi");
		namesList.add("Venkatesh");
		namesList.add("Nagarjuna");

		System.out.println(namesList);

		long countElementsGreaterThan9 = namesList.stream().filter(name -> name.length() >= 9).count();
		System.out.println(countElementsGreaterThan9);
	}
}
