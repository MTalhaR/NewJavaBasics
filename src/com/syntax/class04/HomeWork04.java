package com.syntax.class04;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they are 18 and older 
		 * you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("What is your age?");
		int age=inp.nextInt();
		
		if (age>=18) {
			System.out.println("license will be issued");
		}
		else {
			System.out.println("get a learner's permit");
		}
	}

}
