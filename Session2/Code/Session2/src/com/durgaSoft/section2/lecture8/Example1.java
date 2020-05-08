package com.durgaSoft.section2.lecture8;

public class Example1 {
	public static void main(String[] args) {
		Interf demo1 = new Demo();
		demo1.m1();
		
		Interf demo2 = ()-> System.out.println("m1() method implementation using lambda Expression");
		demo2.m1();
	}
}


interface Interf{
	public void m1();
}

class Demo implements Interf{
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1() method Implementation");
	}
}