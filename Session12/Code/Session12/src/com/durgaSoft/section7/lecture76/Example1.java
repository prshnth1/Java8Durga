package com.durgaSoft.section7.lecture76;

public class Example1 {
public static void main(String[] args) {
	Interf interf = () ->{
		System.out.println("Lambda expression");
	};
}
}

class Test implements Interf{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Old method ");
	}
	
}

interface Interf{
	public void m1();
}