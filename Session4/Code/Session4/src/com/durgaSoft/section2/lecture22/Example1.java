package com.durgaSoft.section2.lecture22;

public class Example1 {

	int x =888;
	
	public void m2() {
		
		Interf4 interf = new Interf4() {
			
			int x =999;
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("We arein m1 method Interf4 "+ this.x); //Output = 999
			}
		};
		
		interf.m1();
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.m2();
	}
	
}


interface Interf4{
	public void m1();
}