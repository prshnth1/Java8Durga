package com.durgaSoft.section7.lecture52;

import java.util.Date;
import java.util.function.Supplier;

public class Example1 {
	public static void main(String[] args) {
		
		Supplier<Date> getSystemDateAndTime = () -> new Date();
		System.out.println(getSystemDateAndTime.get());
	}
}
