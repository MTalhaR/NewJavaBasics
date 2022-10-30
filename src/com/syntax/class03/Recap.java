package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		/* String concatenation help us combine a String with any primitive data type together
		 * 
		 */
		String firstname="Talha";
		String lastname="Riaz";
		String fullname=firstname+ " " +lastname;
		System.out.println(fullname);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=apartmentNo+ " " +houseNo+ " " +streetName+ " " + city+ " " + country;
		System.out.println(fullAddress);
		
		
		String step1="if we subtract 10 from 5 we get =" +10;  // results in a string, when we add a number in a string
		 
		//but this is not defined, java doesn't understand what to do when we ask her to subtract a string from a number it complains
		// String step2=step1-5;
		
		System.out.println(step1);
		
		System.out.println("if we subtract 10 from 5 we get = " + (10-5));
		
	}

}
