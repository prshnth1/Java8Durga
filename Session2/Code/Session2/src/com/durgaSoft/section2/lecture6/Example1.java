package com.durgaSoft.section2.lecture6;

public class Example1 {

}

//Example of functional Interfaces
@FunctionalInterface
interface Intrf1 {
	
	public void m1();

	public static void m2() {

	}

	default void m3() {

	}
}

//Not functional Interface
//@FunctionalInterface
 interface Interf2{
	 
	 public void m1();
	 
	 public void m2();
 
 }


//Not functional Interface
//@FunctionalInterface
interface Interf3{
	 

}
