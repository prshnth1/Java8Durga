package com.durgaSoft.section7.lecture89;

import java.time.LocalDateTime;

public class Example1 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		int date = dateTime.getDayOfMonth();
		int month = dateTime.getMonthValue();
		int year = dateTime.getYear();
		
		int hour = dateTime.getHour();
		int minutes = dateTime.getMinute();
		int seconds = dateTime.getSecond();
		int nano = dateTime.getNano();
		
		
	}
}
