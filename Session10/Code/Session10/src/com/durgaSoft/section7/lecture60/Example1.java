package com.durgaSoft.section7.lecture60;

import java.util.function.BiFunction;

public class Example1 {
	public static void main(String[] args) {
		// Program to calculate product of two numbers 
		BiFunction<Integer, Integer, Integer> productOfTwoNumbers = (num1,num2) -> num1* num2;
		System.out.println(productOfTwoNumbers.apply(2, 3));
		System.out.println(productOfTwoNumbers.apply(4, 4));
	}
}
