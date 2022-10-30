package com.syntax.class12;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */

		String str = "Hello";

		if (str.isEmpty()) {
			System.out.println("String is empty");
		} else if (str.length() > 3 && (str.length() % 2 == 1)) {
			System.out.println("The middle character of "+str+" is: "+str.charAt(str.length()/2));
		}else {
			System.out.println("It has less than 3 letters");
		}
		
		
		String str1="hello";
	    int length=str1.length();
	    if(!str1.isEmpty()&&length%2!=0&&length>=3) {

	        int middleIndex=length/2;
	        System.out.println(str1.charAt(middleIndex));
	    }
	}

}
