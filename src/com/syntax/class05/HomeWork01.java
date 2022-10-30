package com.syntax.class05;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your current time");
		int hour = inp.nextInt();
		
		if (hour>=1 && hour<=11) {
			System.out.println("Morning");
		}
		else if (hour >=12 && hour<=15) {
			System.out.println("Afternoon");
		}
		else if (hour>=16 && hour<=20) {
			System.out.println("Evening");
		}
		else if (hour>=21 && hour<=24) {
			System.out.println("Night");	
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
