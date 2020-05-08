package com.durgaSoft.section7.lecture77;

public class Example2 {
public static void main(String[] args) {
	Runnable runnable = () -> {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	};
	
	Thread t = new Thread(runnable);
	t.start();
	
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
	}

	
}
}
