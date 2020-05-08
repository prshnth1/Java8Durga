package com.durgaSoft.section7.lecture81;

import java.util.stream.Stream;

public class Example9 {
public static void main(String[] args) {
	//for a group values
	Stream<Integer> stream = Stream.of(9,99,999,9999,99999);
	stream.forEach(System.out::println);
	
	//for Arrays
	Double[] numbers= {10.0, 10.1, 10.2, 10.3, 10.4};
	Stream<Double> doubleStream = Stream.of(numbers);
	doubleStream.forEach(System.out:: println);
}
}
