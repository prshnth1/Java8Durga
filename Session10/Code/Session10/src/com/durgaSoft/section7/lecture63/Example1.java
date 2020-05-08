package com.durgaSoft.section7.lecture63;

import java.util.function.BiConsumer;

public class Example1 {
public static void main(String[] args) {
	BiConsumer<String, String> stringConcatenate = (message1,message2) -> System.out.println(message1+" "+message2);
	stringConcatenate.accept("Durga", "Soft");
}
}
