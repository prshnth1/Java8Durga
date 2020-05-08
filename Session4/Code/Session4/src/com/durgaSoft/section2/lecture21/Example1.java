package com.durgaSoft.section2.lecture21;


//Inner Class which implements Concrete Class
class Test {

}


public class Example1 {
	public static void main(String[] args) {
		Test test = new Test() {
			public void testMethod() {
				System.out.println("we are in TEst method");
			}
		};
	}
}
