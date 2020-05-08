package com.durgaSoft.section7.lecture88;

import java.time.LocalDate;

public class Example1 {
public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	
	//default date format year-month-day
	System.out.println("Default date "+date);
	System.out.println();
		
	int day = date.getDayOfMonth();
	int month = date.getMonthValue();
	int year = date.getYear();
	
	System.out.println("Day is "+day);
	System.out.println("Month is "+month);
	System.out.println("Year is "+year);
	System.out.println();
	//Output must be in day-month-year 
	System.out.printf("Customised Date is %d-%d-%d", day,month,year);
}
}
