package com.syntax.class09;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		String [] grades = new String[5];
		
		grades[0]="Java";
		grades[1]="Saturday";
		grades[2]="day";
		grades[3]="coding";
		grades[4]="is";
		
		System.out.println(grades[1]+" "+grades[4]+" "+grades[0]+" "+grades[3]+" "+grades[2]);
		
		System.out.println("-----------------");
		
		String [] grade = {"Java","Saturday","day","coding","is"};
		System.out.println(grades[1]+" "+grades[4]+" "+grades[0]+" "+grades[3]+" "+grades[2]);
		
	}

}
