package com.durgaSoft.section2.lecture23;

public class Example2 {
	public static void main(String[] args) {
		 Test4 test = new Test4();
		 test.m2();
	}
}

interface Interf7{
	public void m1();
}

class Test4{
	int x=10;
	
	public void m2() {
		int y=20;
		
		Interf7 interf7 = () ->{
			//y=888;
			System.out.println(x);
			System.out.println(y);
			
		};
		
		interf7.m1();
	}
}