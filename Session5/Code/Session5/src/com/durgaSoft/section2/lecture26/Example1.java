package com.durgaSoft.section2.lecture26;

public class Example1 {
public static void main(String[] args) {
	Test26 test26 = new Test26();
	Interf26.m1();
}
}

interface Interf26{
	public static void m1() {
		System.out.println("Interface static method");
	}
}

class Test26 implements Interf26{
	
}