package com.durgaSoft.section7.lecture47;

import java.util.function.Function;

public class Example1 {
public static void main(String[] args) {
	Function<String, String> f1 = Function.identity();
	System.out.println(f1.apply("Prashanth"));
}
}
