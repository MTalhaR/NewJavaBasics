package com.syntax.class08;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		// from the range of 1 to 50 please find the sum of all even and all odd numbers
		int evensum = 0;
		int oddsum = 0;
		for(int sum=0; sum<=50; sum++) {
			if(sum%2==0) {
				evensum+=sum;
			} else {
				oddsum+=sum;
			}
		}
		System.out.println("Sum of even numbers is "+evensum);
		System.out.println("Sum of odd numbers is "+oddsum);
		System.out.println("------------------------------------");
		
		/* create a secret number and let user guess the secret number.
		 * once user guessed secret number -> program says you won
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your secret number");
		int num=scan.nextInt();
		int guess;
		
		do {
			System.out.println("Guess the secret number");
			guess=scan.nextInt();
		} while(num!=guess);
		System.out.println("You won!");
	}

}
