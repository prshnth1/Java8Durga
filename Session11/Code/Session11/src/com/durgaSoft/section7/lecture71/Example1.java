package com.durgaSoft.section7.lecture71;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Example1 {
	public static void main(String[] args) {
		//Take a number and print its square using consumer:
		
		//This approach has performance issue
		Consumer<Integer> squareOfANumber1 = number -> System.out.println(number*number);
		squareOfANumber1.accept(3);
		
		//Better Approach
		IntConsumer squareOfANumber2 = number -> System.out.println(number* number);
		squareOfANumber2.accept(3);
		
	}
}
