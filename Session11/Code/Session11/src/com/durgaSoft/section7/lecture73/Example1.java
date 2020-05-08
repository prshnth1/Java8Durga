package com.durgaSoft.section7.lecture73;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Example1 {
	public static void main(String[] args) {
		/*
		 * Below both the input and return type are always of the same type then 
		 * we need to go for Unary Operator
		 */
		Function<Integer, Integer> squareOfANumber1 = number1 -> number1* number1;
		System.out.println(squareOfANumber1.apply(5));
		
		
		/*In Unary Operator we specify only a single type it will take both for
		 * Input and Return type.
		 */
		UnaryOperator<Integer> squareOfANumber2 = number1 -> number1* number1;
		System.out.println(squareOfANumber2.apply(5));
	}
}
