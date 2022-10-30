package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy or girl? 
			Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter Dad's name");
		String dadName=scan.next();
		System.out.println("Please enter Mom's name");
		String momName=scan.next();
		
		String boy = null;
        String girl=null;

        System.out.println("Are you expecting a boy or a girl?");
        String gender=scan.next();

        if(gender.equals("boy")) {

    System.out.println("Suggested boy's name is "+ dadName.substring(0,3).toUpperCase()+momName.substring(2,4).toUpperCase());

        } else {
    System.out.println("Suggested girl's name is "+ momName.substring(0,2).toUpperCase()+dadName.substring(3,6).toUpperCase());
        }
		
	}

}
