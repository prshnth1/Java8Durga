package com.durgaSoft.section7.lecture44;

import java.util.function.Function;

public class Example1 {
	public static void main(String[] args) {
		Function<String, String> toUpperCase = s -> s.toUpperCase();
		Function<String, String> subString   = s -> s.substring(0,9);
		
		System.out.println(toUpperCase.apply("AiswaryaAbhi"));
		System.out.println(subString.apply("AiswaryaAbhi"));
		
		System.out.println(toUpperCase.andThen(subString).apply("AiswaryaAbhi"));
		System.out.println(toUpperCase.compose(subString).apply("AiswaryaAbhi"));
		
	}
}
