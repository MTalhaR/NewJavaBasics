package com.syntax.class08;

import java.util.Scanner;

public class TaskMajor2 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. Whenever user done with payments program 
		 * should say "Thank you for shopping!"
		 */
		
		Scanner in = new Scanner(System.in);
        System.out.println("Enter item you want to buy");
        String item = in.nextLine();
        System.out.println("How much is it?");
        double price = in.nextDouble();
        double money;
        double total = 0;
        double need;
        double change;
        
        do {
        	System.out.println("How much money do you have?");
        	money=in.nextDouble();
        	total+=money; // accumulate all money
        	if(total<price) {
        		need=price-total;
        		System.out.println("You need to pay more $ "+need);
        	}
        	else if(total>price) {
        		change=total-price;
        		System.out.println("Here is your change "+change);
        		break;
        	}
        	
        } while (total != price);
        System.out.println("Thank you for shopping with us");

    }

}