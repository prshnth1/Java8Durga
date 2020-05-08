package com.durgaSoft.section7.lecture59;

import java.util.function.BiPredicate;

public class Example1 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> checkSumEven = (num1, num2) -> (num1+num2)%2==0;
		BiPredicate<Integer, Integer> checkSumLessThan100 = (num1,num2) -> num1+num2<100;
		
		System.out.println(checkSumEven.test(1, 2));
		System.out.println(checkSumEven.test(2, 2));
		
		
		System.out.println(checkSumEven.or(checkSumLessThan100).test(1, 2000));
		System.out.println(checkSumEven.negate().test(1, 2));
	}
}
