package com.durgaSoft.section2.lecture7;

public class Example1 {

}

@FunctionalInterface
interface One{
	public void m1();
}

@FunctionalInterface
interface OnesChild extends One{
	
} 


@FunctionalInterface
interface Two{
	public void m1();
}

@FunctionalInterface
interface TwosChild extends One{
	public void m1();
} 

@FunctionalInterface
interface Three{
	public void m1();
}

//@FunctionalInterface
interface ThreesChild extends One{
	public void m2();
} 