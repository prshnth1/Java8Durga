package com.durgaSoft.section7.lecture40;

import java.util.function.Function;


public class Example3 {
	public static void main(String[] args) {
		String message = "Durga Software Solutions Hyderabad";
		Function<String, Integer> spaceCounter = string -> 
					message.length() - message.replaceAll(" ","").length();	
		System.out.println(spaceCounter.apply(message));
	}
}
