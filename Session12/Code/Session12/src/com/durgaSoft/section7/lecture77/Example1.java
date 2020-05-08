package com.durgaSoft.section7.lecture77;

public class Example1 {
	
	public void m2() {
		System.out.println("Method Reference");
	}

	
	public static void main(String[] args) {
		Example1 example = new Example1();
		Interf1 interf = example::m2;
		interf.m1();
	}
}

interface Interf1{
	public void m1();
}