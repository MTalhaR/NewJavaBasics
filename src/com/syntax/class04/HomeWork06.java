package com.syntax.class04;

import java.util.Scanner;

public class HomeWork06 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you user does not have a 
		 * credit card then offer them. If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("DO you have credit card or not?");
		boolean GotCard=inp.nextBoolean();
		if(GotCard) {
			System.out.println("What is your balance?");
			int balance=inp.nextInt();
			if(balance>1000) {
				System.out.println("pay off imediately");
			}
			else {
				System.out.println("You can spend more");
			}
		}
			else {
				System.out.println("here's your new credit card");
			}
		
		
	}

}
