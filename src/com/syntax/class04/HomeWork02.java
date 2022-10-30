package com.syntax.class04;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, 
		 * otherwise user will consider buying. Once user decides to buy a house, if price of 
		 * the house is larger than 200000 than user will take a loan, otherwise user will pay cash
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("What is the mortage rate?");
		double rate=inp.nextDouble();

		if (rate<4.5) {
			System.out.println("User will buy the house");
			System.out.println("What is the Mortage price?");
			double price=inp.nextDouble();
			if (price>200000) {
				System.out.println("User will take loan");
			}
			else {
				System.out.println("User will pay cash");
			}
		}
			else {
				System.out.println("User will not buy the house");
			}
		}
		
	}
