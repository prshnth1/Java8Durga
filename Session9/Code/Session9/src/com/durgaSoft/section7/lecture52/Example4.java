package com.durgaSoft.section7.lecture52;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Logic to generate Random Password:
 * 
 * 1) Length should be 8 Characters only
 * 2) 2,4,6,8 places only digits are allowed
 * 3) 1,3,5,7 place only upper case Alphabets or special characters.
 * 		Special characters allowed are @,#,$.
 */

public class Example4 {
	public static void main(String[] args) {
		Random random = new Random();
		String[] symbols = {"@","#","$"};
		
		Supplier<Integer> getDigits = () ->  random.nextInt(10);
		Supplier<Character> getCharacter = () ->  (char)(random.nextInt(26)+65);	
		Supplier<String> getSymbol =() -> symbols[random.nextInt(symbols.length)];
		
		Supplier<String> generatePassword = () ->{
			String password ="";
			
			for(int i=0;i<8;i++) {
				if(i%2==0) {
					password =password+getDigits.get();
				}else {
					if(random.nextBoolean()) {
						password = password+getCharacter.get();
					}else {
						password = password+getSymbol.get();
					}
				}
			}
			
			return password;
		};
		System.out.println("Generated Password is "+generatePassword.get());
	}
}
