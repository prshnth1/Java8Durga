package com.durgaSoft.section7.lecture48;

import java.util.function.Consumer;

public class Example1 {
	public static void main(String[] args) {
		String message ="Hello";
		
		Consumer<String> dispaly = consumerMessage -> System.out.println(consumerMessage);
		dispaly.accept(message);
		
	}
}
