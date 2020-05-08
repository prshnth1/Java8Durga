package com.durgaSoft.section2.lecture24;

public class Example2 {
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.m1();
	}
}

class Test2 implements Interf2 {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("We are in Test2 m1 method");
	}
}

interface Interf2 {
	default void m1() {
		System.out.println("Default method");
	}
}