package com.syntax.class06;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		
		Scanner inp=new Scanner(System.in);
		System.out.println("What is your country?");
		String country=inp.next();
		String language;
		
		switch(country) {
			case "Paksitan":
				language="Urdu";
				break;
				
			case "USA":
				language="English";
				break;
				
			case "Turkey":
				language="Turkish";
				break;
				
			case "Afghanistan":
				language="Pashto";
				break;
				
			default:
				language="unknown";
		}
		System.out.println(language+" is spoken in "+country);
	}

}
