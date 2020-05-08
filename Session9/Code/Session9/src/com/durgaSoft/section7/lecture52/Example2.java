package com.durgaSoft.section7.lecture52;

import java.util.Random;
import java.util.function.Supplier;

import javax.xml.stream.events.Namespace;

public class Example2 {
	public static void main(String[] args) {
		Random random = new Random();
		String[] names = { "Sunny", "Bunny", "Chinny", "Vinny" };

		Supplier<String> getRandomName = () -> {
			return names[random.nextInt(names.length)];
		};
		System.out.println(getRandomName.get());
		
		
		for(int i =0;i<30;i++) {
			System.out.println(random.nextInt(names.length));
		}
	}

}
