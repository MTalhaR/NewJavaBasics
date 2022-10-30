package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month=inp.next();
		String seasonOfBirth;
		
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			seasonOfBirth="Spring";
		}
		else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			seasonOfBirth="Summer";
		}
		else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			seasonOfBirth="Autumn";
		}
		else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			seasonOfBirth="Winter";
		}
		else {
			seasonOfBirth="Invalid Month";
		}
		System.out.println(seasonOfBirth);
	}

}
