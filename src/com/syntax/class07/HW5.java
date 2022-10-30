package com.syntax.class07;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner in=new Scanner(System.in);
		String name= null;
		
		int i=1;	
		while(i<=3) {
			System.out.println("Enter your name");
			name=in.next();
			System.out.println("Good Afternoon "+name);
			i++;
		}
		System.out.println("-----------------------------");
		
		for(int a=1; a<=3; a++) {
			System.out.println("Enter your name");
			name=in.next();
			System.out.println("Good Afternoon "+name);
		}
	}
}
