package com.syntax.class04;

import java.util.Scanner;

public class HomeWork07 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number of years you worked");
		int years=inp.nextInt();
		
		if (years>=5) {
			System.out.println("you are eligible for bonus");
			System.out.println("What is your salary");
			int salary=inp.nextInt();
			if (salary>50000) {
				System.out.println("your bonus will be 5000");
			}
			else {
				System.out.println("your bonus will be 3000");
			}
		}
		else {
			System.out.println("you are not eligible");
		}
	}

}
