package com.durgaSoft.section2.lecture24;

public class Example3 {


}


interface Left3{
	default void m1() {
		System.out.println("Left Default method");
	}
}

interface Right3{
	default void m1() {
		System.out.println("Right Default method");
	}
}


class Test3 implements Left3{
	
}