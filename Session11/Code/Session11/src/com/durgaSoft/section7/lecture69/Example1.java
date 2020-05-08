package com.durgaSoft.section7.lecture69;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Example1 {
	public static void main(String[] args) {

		int[] integerNumbers = { 0, 5, 10, 20, 25 };

		IntFunction<Integer> square = number -> number * number;

		for (int i : integerNumbers) {
			System.out.println(square.apply(i));
		}

	}
}
