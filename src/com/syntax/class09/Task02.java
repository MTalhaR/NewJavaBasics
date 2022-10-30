package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		

		String [] grades = new String[4];
		
		grades[0]="Talha";
		grades[1]="Asma";
		grades[2]="Atika";
		grades[3]="Fawaz";
		
		
		System.out.println(grades[0]);
		
		System.out.println("-----------------");
		
		String [] grade = {"Talha","Asma","Atika","Fawaz"};
		System.out.println(grade[0]);
		
		
	}

}
