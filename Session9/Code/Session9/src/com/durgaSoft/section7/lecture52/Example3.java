package com.durgaSoft.section7.lecture52;

import java.util.Random;
import java.util.function.Supplier;

public class Example3 {
public static void main(String[] args) {
	Random random = new Random();
	Supplier<Integer> generteOTP = () -> random.nextInt(1000000);
	System.out.println(generteOTP.get());
}
}
