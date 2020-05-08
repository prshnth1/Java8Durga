package com.durgaSoft.section2.lecture22;

public class Example2 {

	int x =888;
	
	public void m2() {
		
		Interf5 interf = () -> {
				int x =999;
				System.out.println("We arein m1 method Interf4 "+ this.x); //Output = 888
			
		};
		
		interf.m1();
	}
	
	public static void main(String[] args) {
		Example2 example1 = new Example2();
		example1.m2();
	}
	
}


interface Interf5{
	public void m1();
}