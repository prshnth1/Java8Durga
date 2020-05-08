package com.durgaSoft.section2.lecture9;

public class Example4 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Myrunnable());
		thread1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + i);

		}
	}
}

class Myrunnable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread" + i);
		}
	}
}