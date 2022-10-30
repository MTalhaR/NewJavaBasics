package com.syntax.class06;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */

		Scanner inp=new Scanner (System.in);
		System.out.println("Enter your grade!");
		char grade=inp.next().charAt(0);
		String explanation;
		
		switch(grade) {
			case 'A':
			explanation="Excellent";
			break;
			
			case 'B':
				explanation="Good";
				break;
				
			case 'C':
				explanation="Average";
				break;
				
			case 'D':
				explanation="Bad";
				break;
				
			case 'F':
				explanation="Fail";
				break;
				
			default:
				explanation="Not Acceptable";
		}
		System.out.println("you got "+grade+" which is "+explanation+" grade");
	}

}
