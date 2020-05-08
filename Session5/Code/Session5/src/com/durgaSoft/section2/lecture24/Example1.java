package com.durgaSoft.section2.lecture24;

public class Example1 {
	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
	}
}

class Test implements Interf1 {

}

interface Interf1 {
	default void m1() {
		System.out.println("Default method");
	}
}