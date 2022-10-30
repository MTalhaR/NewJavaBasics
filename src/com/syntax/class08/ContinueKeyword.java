package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=1; i<5; i++) {
			System.out.println("Hello");
			
		}
		System.out.println("End");
		System.out.println("---------------------");
		
		for (int i=1; i<5; i++) {
			
			if(i==3)
				continue; // skips the cycle and go back to the beginning/next iteration
			System.out.println(i);
		}
	
		System.out.println("---------------------");
		
		// I want to print numbers from 1 to 20 except 3,7 and 11
		
		for (int i=1; i<=20; i++) {
			if(i==3 || i==7 || i==11) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		

	}

}
