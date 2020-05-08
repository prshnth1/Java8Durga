package com.durgaSoft.section7.lecture40;

import java.util.function.Function;

public class Example1 {
public static void main(String[] args) {
	Function<String, String> removeSpace = (string) -> string.replaceAll(" ","");
	String message ="Durga Software Solutions Hyderabad";
	System.out.println(removeSpace.apply(message));
}
}
