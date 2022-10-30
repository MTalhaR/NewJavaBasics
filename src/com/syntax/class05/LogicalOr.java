package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/*
		 * true || true --> TRUE
		 * true || false --> TRUE
		 * false || true --> TRUE
		 * false || false --> FALSE
		 */
		String day="Saturday";
		
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class at Syntax");
		}
		System.out.println("--------------------------");
		
		double money = 120000;
		String title = "Automation Tester";
		
		if(title.equals("Automation Tester") || money == 120000) {
			System.out.println("Happy");
		}
	}

}
