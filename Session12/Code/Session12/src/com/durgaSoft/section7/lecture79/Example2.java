package com.durgaSoft.section7.lecture79;

public class Example2 {
	public static void main(String[] args) {
		Interf792 interf = SampleExample2 :: new;
		interf.get();
		
		Interf793 interf1 = SampleExample2:: new;
		interf1.get(3);
		
	}
}

class SampleExample2{
	int data =0;
	
	public SampleExample2() {
		// TODO Auto-generated constructor stub
		System.out.println("Sample Default Constructor");
	}
	
	public SampleExample2(int data) {
		System.out.println("We are in Single Argument Constructor");
	}
}

interface Interf792{
	public SampleExample2 get();
}

interface Interf793{
	public SampleExample2 get(int number);
}