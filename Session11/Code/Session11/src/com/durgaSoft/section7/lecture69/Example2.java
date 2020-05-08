package com.durgaSoft.section7.lecture69;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Example2 {
public static void main(String[] args) {
	
	Function<String, Integer> getLength1 = string -> string.length();
	System.out.println(getLength1.apply("Prashanth"));
	
	
	
	ToIntFunction<String> getLength2 = string -> string.length();
	System.out.println(getLength2.applyAsInt("Prashanth Angadikunnath"));
}
}
