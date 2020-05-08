package com.durgaSoft.section2.lecture9;

public class Example2 {
	public static void main(String[] args) {
		
		//With out Lambda Expression
		Interface interf1 = new Demo1();
		System.out.println(interf1.getLength("hello "));
		System.out.println(interf1.getLength("Without Lambda Expression"));
		
		//With Lambda Expression
		Interface interf2 = s -> s.length();
		System.out.println(interf2.getLength("hello "));
		System.out.println(interf2.getLength("Without Lambda Expression"));
		
	}
}

interface Interface {
	public int getLength(String string);
}

class Demo1 implements Interface {
	@Override
	public int getLength(String string) {
		// TODO Auto-generated method stub
		return string.length();
	}
}