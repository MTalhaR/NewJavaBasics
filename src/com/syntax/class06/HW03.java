package com.syntax.class06;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment using if statement.
		 */

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number two numbers!");
		double num1 = inp.nextDouble();
		double num2 = inp.nextDouble();
		double num3 = 0;
		System.out.println("Enter the operation character");
		char operator = inp.next().charAt(0);
		boolean wrongOperator = false;

		if (operator == '+') {
			num3 = num1 + num2;
		} else if (operator == '-') {
			num3 = num1 - num2;
		} else if (operator == '/') {
			num3 = num1 / num2;
		} else if (operator == '*') {
			num3 = num1 * num2;
		} else if (operator == '%') {
			num3 = num1 % num2; 
		} else {
			System.out.println("invalid");
			
		}
		if(wrongOperator)
		System.out.println("The "+operator+" of two numbers "+num1+" and "+num2+" is equal to "+num3);
	}

}
