package com.syntax.class07;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		/* Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
		 * Keep asking to pay for coffee until the user enters the EXACT amount . 
		 * If the user gives more than coffee price --> ask them to give less, 
		 * if the user gives less money then ask to give more. Once user give EXACT amount print 
		 * “Please enjoy your coffee
		 */
		
		
		int coffee = 0;
		int price;
		Scanner scan=new Scanner(System.in);
		System.out.println("What's the price of coffee?");
		coffee= scan.nextInt();
		do {
			System.out.println("Please pay for your order: ");
			price=scan.nextInt();
		 if(price>coffee) {
			System.out.println("Please pay less");
			
		}
		else if(price<coffee) {
			System.out.println("Please pay more");
			
		} else
			System.out.println("Please enjoy your coffee");
	 
		} while (coffee!=price);
		
	}

}
