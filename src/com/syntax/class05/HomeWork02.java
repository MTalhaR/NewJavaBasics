package com.syntax.class05;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your birth month");
		
		String month=inp.next();
		
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("My birth month is in Spring");
		}
		else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("My birth month is in Summer");
		}
		else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("My birth month is in Autumn");
		}
		else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("My birth month is in Winter");
		}
	}

}
