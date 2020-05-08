package com.durgaSoft.section7.lecture73;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Example2 {
	public static void main(String[] args) {
	
		IntUnaryOperator squareOfANumber2 = number1 -> number1* number1;
		System.out.println(squareOfANumber2.applyAsInt(2));
	
	}
}
