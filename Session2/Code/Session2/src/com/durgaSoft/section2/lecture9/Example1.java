package com.durgaSoft.section2.lecture9;

public class Example1 {
	public static void main(String[] args) {
		Interf interf1 = new Demo();
		interf1.add(10, 20);
		interf1.add(100, 200);
		
		Interf interf2 = (a, b)-> System.out.println("The Sum is "+( a+ b));
		interf2.add(10, 20);
		interf2.add(100, 200);
	}
}

interface Interf{
	public void add(int a, int b);
}

class Demo implements Interf{
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The Sum is "+(a+b));
	}
}