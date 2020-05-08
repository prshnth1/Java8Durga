package com.durgaSoft.section2.lecture24;

public class Example4 {

public static void main(String[] args) {
	Test4 test4 = new Test4();
	test4.m1();
}
}


interface Left4{
	default void m1() {
		System.out.println("Left Default method");
	}
}

interface Right4{
	default void m1() {
		System.out.println("Right Default method");
	}
}


class Test4 implements Left4 ,Right4{
	
	public void m1() {
		System.out.println("My own Implementation");
	}
}