package com.durgaSoft.section7.lecture76;

public class Example2 {

	public static void m2() {
		System.out.println("Method Reference");
	}

	public static void main(String[] args) {
		Interf interf = Example2::m2;
		interf.m1();
	}

}
