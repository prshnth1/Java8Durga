package com.durgaSoft.section7.lecture81;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
public static void main(String[] args) {
	ArrayList<String> namesList = new ArrayList<String>();
	namesList.add("Pavan"); 		namesList.add("Raviteja"); 
	namesList.add("Chiranjivi");	namesList.add("Venkatesh");
	namesList.add("Nagarjuna"); 
	
	System.out.println(namesList);
	
	List<String> upperCase = namesList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
	System.out.println(upperCase);
}
}
