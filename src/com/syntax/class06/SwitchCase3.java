package com.syntax.class06;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		/*
		 * we need to ask a user where he/she is from
		 * based on the country -> define favorite food
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country=inp.nextLine();
		String favoriteFood;
		
		switch (country) {
		
		case "Usa":
			favoriteFood="burgers and fries";
			break;
			
		case "Kazakhitan":
			favoriteFood="beshparmak";
			break;
			
		case "Turkey":
			favoriteFood="adana kebab";
			break;
		case "Venuzuela":
			favoriteFood="Arepa";
			break;
			
		case "India":
			favoriteFood="Chicken curry";
			break;
			
		case "Yemen":
			favoriteFood="Mandi";
			break;
			
		case "Afghanistan":
			favoriteFood="Qaboli palao";
			break;
			
		default:
			favoriteFood="Unknown";
			break;
		}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
		
	}

}
