package com.syntax.class07;

public class HW3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		
		int i=20;
		while(i>=1) {
			System.out.print(i+" ");
		i-=2;
		}
		System.out.println("------------------------------------");
		
		int a=20;
		while (a>=1) {
			if(a %2==0) {
				System.out.print(a+" ");
			}
			a--;
		}
		System.out.println("------------------------------------");
		
		int b=20;
		while(b>=1 && b %2==0) {
			System.out.print(b+" ");
			b-=2;
		}
		System.out.println("------------------------------------");
		
		for(int x=20; x>=1; x-=2) {
			System.out.print(x+" ");
		}
		System.out.println("------------------------------------");
		for(int p=20; p>=1; p--) {
			if(p%2==0) {
				System.out.print(p+" ");
			}
		}
	}

}
