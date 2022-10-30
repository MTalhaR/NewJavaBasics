package com.syntax.class13;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
		 */

		String all="abcdABCD1234!@#$";
		String all1=all.replaceAll("[^a-z A-Z 0-9]","");
		System.out.println(all1.length());

		String newString = "FDFDegfg#$#2356$#$";
		String newstring = newString.replaceAll("[^A-z0-9]","");
		System.out.println(newstring.length());
	}

}
