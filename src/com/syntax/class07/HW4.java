package com.syntax.class07;

public class HW4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		int i=21;
		while (i<=50) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println("-----------------------");
		
		int a=20;
		while (a<=50) {
			if(a %2==1) {
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.println("------------------------------------");
		
		int b=21;
		while(b<=50 && b %2==1) {
			System.out.print(b+" ");
			b+=2;
		}
		System.out.println("------------------------------------");
		
		for(int x=21; x<=50; x+=2) {
			System.out.print(x+" ");
		}

	}

}
