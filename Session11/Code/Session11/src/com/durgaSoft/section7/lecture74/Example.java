package com.durgaSoft.section7.lecture74;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Example {
public static void main(String[] args) {
	
	BiFunction<String, String, String> concatinateMessag1 = (message1, message2) -> message1+" "+message2;
	System.out.println(concatinateMessag1.apply("Prashanth ", "Angadikunnath"));
	
	BinaryOperator<String> concatinateMessage2 = (message1, message2) -> message1+" "+message2;
	System.out.println(concatinateMessage2.apply("Prashanth ", "Angadikunnath"));
}
}
