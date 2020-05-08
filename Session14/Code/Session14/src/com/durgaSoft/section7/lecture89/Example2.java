package com.durgaSoft.section7.lecture89;

import java.time.LocalDateTime;

public class Example2 {
	public static void main(String[] args) {
		//How to represent 1995-May-28 and time is 12:45
		LocalDateTime dateTime = LocalDateTime.of(1995, 05, 28, 12,45);
		System.out.println(dateTime);
		
		//Add Days
		System.out.println(dateTime.plusDays(4));
		
		//minus Days
		System.out.println(dateTime.minusDays(2));
	}
}
