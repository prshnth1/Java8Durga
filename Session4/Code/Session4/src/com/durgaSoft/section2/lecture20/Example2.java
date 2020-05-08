package com.durgaSoft.section2.lecture20;

public class Example2 {
	public static void main(String[] args) {
		
		//Anonymouse Inner class:
		
		Runnable r = () ->{
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}			
		};
		
		Thread th = new Thread(r);		
		th.start();		
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	
	}	
	

}
