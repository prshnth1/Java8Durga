package com.durgaSoft.section2.lecture23;

public class Example1 {
	public static void main(String[] args) {
		 Test test = new Test();
		 test.m2();
	}
}

interface Interf6{
	public void m1();
}

class Test{
	int x=10;
	
	public void m2() {
		int y=20;
		
		Interf6 interf = () ->{
			System.out.println(x);
			System.out.println(y);
		};
		
		interf.m1();
	}
}