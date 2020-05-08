package com.durgaSoft.section7.lecture40;

import java.util.function.Function;

/*
 * Here I am using indexOf method which will check for a particular character in a 
 * String. 
 */
public class Example2 {
	public static void main(String[] args) {
		String message = "Durga Software Solutions Hyderabad";
		Function<String, Integer> spaceCounter = string -> {
			int result=0; int count=0;
			for(;result!=-1;count++) {
				result =string.indexOf(" ", result+1);
			}
			//Count should be subtracted by 1 as its even counting when the value is -1
			return count-1;		
		};
		System.out.println(spaceCounter.apply(message));
	}
}
