package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		for (int i=1; i<5; i++) {
			System.out.println("Hello");
			
		}
		System.out.println("End");
		System.out.println("---------------------");
		
		for (int i=1; i<5; i++) {
			System.out.println("Hello");
			if(i==3)
				break; // breaks the loop and it is usually used inside some type of condition
		}
		System.out.println("End");
		System.out.println("---------------------");

		boolean hungry=true;
		
		while (hungry) {
			System.out.println("Give me food");
			break;
		}
		
		
	}

}
