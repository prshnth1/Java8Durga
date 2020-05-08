package com.durgaSoft.section7.lecture90;

import java.time.LocalDate;
import java.time.Period;

public class Example1 {
	public static void main(String[] args) {
		LocalDate todaysDate = LocalDate.now();
		LocalDate endDay = LocalDate.of(2050, 04, 24);

		Period age = Period.between(todaysDate, endDay);
		System.out.printf("Your age is %d years %d months %d days ", age.getYears(), age.getMonths(), age.getDays());
		System.out.println(365*age.getYears()+30*age.getMonths()+age.getDays());
		System.out.println();
	}
}
