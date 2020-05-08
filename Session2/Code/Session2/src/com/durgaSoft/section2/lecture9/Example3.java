package com.durgaSoft.section2.lecture9;

public class Example3 {
	public static void main(String[] args) {
	
		Interf1 interf1 = new Demo3();
		System.out.println(interf1.squareIt(2));
		System.out.println(interf1.squareIt(3));

	
		Interf1 interf2 = x -> x*x;
		System.out.println(interf2.squareIt(2));
		System.out.println(interf2.squareIt(3));
	}
}

interface Interf1{
	public int squareIt(int x);
}

class Demo3 implements Interf1{
	@Override
	public int squareIt(int x) {
		// TODO Auto-generated method stub
		return x * x;
	}
}