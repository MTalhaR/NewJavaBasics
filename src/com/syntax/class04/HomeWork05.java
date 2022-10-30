package com.syntax.class04;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print "The temperature is the city  is   "
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("what is your city?");
		String city=inp.next();
		System.out.println("What is the temp");
		double temp=inp.nextDouble();
		double conversion=(temp-32)*0.6;
		System.out.println("The temperature in "+city+" is "+conversion);
		
		
		
	}

}
