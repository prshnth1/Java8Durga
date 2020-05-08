package com.durgaSoft.section7.lecture46;

import java.util.function.Function;

public class Example1 {
	public static void main(String[] args) {
		Function<String, String> userNameMapping= userName -> userName.substring(0, 5);
		Function<String, String> toLowerCase = string -> string.toLowerCase();
		
		String userName = "Durga";
		String password = "java";
		
		if((userNameMapping.andThen(toLowerCase).apply(userName).equals("durga")) && password.equals("java")) {
			System.out.println("Welcome");
		}else {
			System.out.println("Enter proper credentials");
		}
	}
}
