package com.durgaSoft.section2.lecture21;


//Anonymous inner class that implements 
//an interface which contains only single 
//

interface Test4{
	public void m1();
}

public class Example4 {
	public static void main(String[] args) {
		 
		Test4 test3 = new Test4() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("We are in method m1");
			}
			
		};
	}
}
