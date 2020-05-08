package com.durgaSoft.section2.lecture9;

public class Example5 {
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Tread" + i);

			}
		};
		
		Thread thread = new Thread (r);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + i);

		}
	}
}

