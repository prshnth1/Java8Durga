package com.durgaSoft.section7.lecture77;

public class Example3 {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		Example3 example = new Example3();
		Runnable runnable = example::m1;
		
		Thread t = new Thread(runnable);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
