package com.durgaSoft.section2.lecture5;

public class Example1 {

}

//Example of functional Interfaces

interface Intrf1 {
	
	public void m1();

	public static void m2() {

	}

	default void m3() {

	}
}

//Not functional Interface
 interface Interf2{
	 
	 public void m1();
	 
	 public void m2();
 
 }
