package com.syntax.class06;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 * Please complete this assignment using switch case.
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter number 1!");
		double num1=inp.nextDouble();
		System.out.println("Enter number 2!");
		double num2=inp.nextDouble();
		double num3 = 0;
		System.out.println("Enter the operation character");
		char operator=inp.next().charAt(0);
		
		switch (operator) {
			case '+':
			num3=num1+num2;
			break;
			
			case '-':
				num3=num1-num2;
				break;
				
			case '*':
				num3=num1*num2;
				break;
				
			case '/':
				num3=num1/num2;
				break;
				
			case '%':
				num3=num1%num2;
				break;
				
			default:
				System.out.println("invalid");
		}
		System.out.println("The "+operator+" of two numbers "+num1+" and "+num2+" is equal to "+num3);
	}

}
