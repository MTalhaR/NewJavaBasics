package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your current time");
		int hour = inp.nextInt();
		
		String timeOfTheDay;		
		
		if (hour>=1 && hour<=11) {
			timeOfTheDay="Morning";
		}
		else if (hour >=12 && hour<=15) {
			timeOfTheDay="Afternoon";
		}
		else if (hour>=16 && hour<=20) {
			timeOfTheDay="Evening";
		}
		else if (hour>=21 && hour<=24) {
			timeOfTheDay="Night";	
		}
		else {
			timeOfTheDay="Invalid";
		}
		System.out.println(timeOfTheDay);
	}

}
