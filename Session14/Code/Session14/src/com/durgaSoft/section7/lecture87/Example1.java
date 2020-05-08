package com.durgaSoft.section7.lecture87;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example1 {
	public static void main(String[] args) {
		
		//To get current system date:
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//To get current time.
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
	}
}
