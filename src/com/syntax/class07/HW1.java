package com.syntax.class07;

public class HW1 {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("-------------------------");
		
		int a=1;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("------------------------");
		int b=1;
		do {
			System.out.print(b+" ");
			b++;
		} while(b<=100);
	}

}
