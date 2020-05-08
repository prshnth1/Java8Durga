package com.durgaSoft.section7.lecture79;

public class Example1 {
	public static void main(String[] args) {
		Interf79 interf = () -> new Sample();
		
	}
}

class Sample{
	public Sample() {
		// TODO Auto-generated constructor stub
		System.out.println("Sample Default Constructor");
	}
}

interface Interf79{
	public Sample get();
}