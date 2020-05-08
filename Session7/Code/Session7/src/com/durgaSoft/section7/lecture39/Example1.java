package com.durgaSoft.section7.lecture39;

import java.util.function.Function;

//To calculate the lenght of a given String
public class Example1 {
	public static void main(String[] args) {
		
		Function<String,Integer> lengthOfString = (s) -> s.length();
		
		System.out.println(lengthOfString.apply("Prashanth"));
		System.out.println(lengthOfString.apply("We"));
		
		
		Function<Integer, Integer> squareOfANumber =(num) -> num * num;
		System.out.println(squareOfANumber.apply(2));
		System.out.println(squareOfANumber.apply(4));
	}
}
