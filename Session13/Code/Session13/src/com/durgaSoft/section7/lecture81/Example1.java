package com.durgaSoft.section7.lecture81;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {

		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Pavan"); 		namesList.add("Raviteja"); 
		namesList.add("Chiranjivi");	namesList.add("Venkatesh");
		namesList.add("Nagarjuna"); 
		
		System.out.println(namesList);
		
		ArrayList<String> filteredName  = new ArrayList<String>();
		
		for (String name : namesList) {
			if(name.length() >=9) {
				filteredName.add(name);
			}
		}
		System.out.println(filteredName);
	}
}
