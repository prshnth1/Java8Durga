package com.durgaSoft.section2.lecture21;


//Anonymouse Inner Class that implements abstract methods.
abstract class Test2 {

}

public class Example2 {
	public static void main(String[] args) {
		Test2 test2 = new Test2() {
			public void print() {
				System.out.println("We are in Print method");
			}
		};
	}
}
