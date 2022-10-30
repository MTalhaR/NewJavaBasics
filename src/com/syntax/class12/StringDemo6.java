package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		
		String str="I love java programming";
		
		//toCharArray will covert a String to an array of chars
		char[] charArray=str.toCharArray();
		System.out.println(charArray);
		System.out.println(charArray[7]);
		System.out.println(Arrays.toString(charArray));
		
		
		int counter=0;
		for (char c:charArray) {
			if(c=='a') {
				counter++;
			}
		}
		System.out.println("letter a has appeared "+counter+" times");
		
	}

}
