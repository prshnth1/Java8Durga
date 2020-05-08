package com.durgaSoft.section7.lecture72;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * To generate 6 digit OTP
 * 
 * Logic 
 * 		Random r = new Random();
 *		int low = 10;
 *		int high = 100;
 *		int result = r.nextInt(high-low) + low;
 *		
 *	This gives you a random number in between 10 (inclusive) and 100 (exclusive)
 * **/

public class Example1 {
public static void main(String[] args) {
	Random random = new Random();
	
	Supplier<Integer> randomNumber1 = () -> random.nextInt(1000000-100000)+100000;
	System.out.println(randomNumber1.get());
	
	IntSupplier randomNumber2 = () -> random.nextInt(1000000-100000)+100000;
	System.out.println(randomNumber2.getAsInt());
	
}
}
