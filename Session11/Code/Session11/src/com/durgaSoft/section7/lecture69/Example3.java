package com.durgaSoft.section7.lecture69;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class Example3 {
	public static void main(String[] args) {
		// To calculate SquareRoot of a Number
		Function<Integer, Double> squareRoot1 = number -> Math.sqrt(number);
		System.out.println(squareRoot1.apply(4));
		System.out.println(squareRoot1.apply(5));

		IntToDoubleFunction squareRoot2 = number -> Math.sqrt(number);
		System.out.println(squareRoot2.applyAsDouble(4));
		System.out.println(squareRoot2.applyAsDouble(5));

	}
}
