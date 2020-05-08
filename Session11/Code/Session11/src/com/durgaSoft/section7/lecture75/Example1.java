package com.durgaSoft.section7.lecture75;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Example1 {
	public static void main(String[] args) {
		BinaryOperator<Integer> sumOf2Number1 =(num1, num2) -> num1+num2;
		System.out.println(sumOf2Number1.apply(2, 3));
		
		IntBinaryOperator  sumOf2Number2 =(num1, num2) -> num1+num2;
		System.out.println(sumOf2Number2.applyAsInt(2, 3));
	}
}
