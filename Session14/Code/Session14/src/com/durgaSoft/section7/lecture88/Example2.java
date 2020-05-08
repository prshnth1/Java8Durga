package com.durgaSoft.section7.lecture88;

import java.time.LocalTime;

public class Example2 {
public static void main(String[] args) {
	LocalTime time = LocalTime.now();
	
	//output 11:07:26.920
	System.out.println("Default time "+time);
	System.out.println();
	
	int hours = time.getHour();
	int minutes = time.getMinute();
	int seconds = time.getSecond();
	int nano = time.getNano();
	
	System.out.println("Hour "+hours);
	System.out.println("Minutes "+minutes);
	System.out.println("Seconds "+seconds);
	System.out.println("Nano "+nano);
	System.out.println();

	//Output 11:7:26:920000000
	System.out.printf("%d:%d:%d:%d",hours,minutes,seconds,nano);
}
}
