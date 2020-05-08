package com.durgaSoft.section2.lecture24;

public class Example5 {

public static void main(String[] args) {
	Test5 test5 = new Test5();
	test5.m1();
}
}


interface Left5{
	default void m1() {
		System.out.println("Left Default method");
	}
}

interface Right5{
	default void m1() {
		System.out.println("Right Default method");
	}
}


class Test5 implements Left5 ,Right5{
	
	public void m1() {
		System.out.println("My own Implementation");
		Right5.super.m1();
	}
}