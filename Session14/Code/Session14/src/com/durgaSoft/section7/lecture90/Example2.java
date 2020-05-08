package com.durgaSoft.section7.lecture90;

import java.time.Year;

public class Example2 {
public static void main(String[] args) {
	int year =2001;
	Year checkYear = Year.of(year);
	
	if(checkYear.isLeap()) {
		System.out.println("Its a leap year");
	}else{
		System.out.println("Not a leap year");
	}
	
	
}
}
