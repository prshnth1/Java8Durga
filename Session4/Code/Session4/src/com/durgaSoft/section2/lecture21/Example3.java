package com.durgaSoft.section2.lecture21;


//Anonymous inner class that implements 
//an interface which contains multiple
//methods

interface Test3{
	public void m1();
	public void m2();
	public void m3();
}

public class Example3 {
	public static void main(String[] args) {
		 
		Test3 test3 = new Test3() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("We are in method m1");
			}
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("We are in method m2");
			}
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println("We are in method m3");
			}
		};
	}
}
