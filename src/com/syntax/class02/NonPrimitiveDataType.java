package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is just 1 example of Non-Primitive Data Type
		String name = "Asma";
		String address = "D59 Wah Cantt";
		int age = 17;
		
		// Ctrl+space -> auto completes the statement
		// syso + ctrl + space 
		System.out.println(name);
		System.out.println(address);
		
		// "My name is"  = Asma
		System.out.println("My name is " + name);
		
		// Asma is 17
		System.out.println(name +" is "+ age);
		
		String fruit = "apple";
		double price = 1.99;
		
		// The price of the apple is 1.99
		System.out.println("The price of "+ fruit + " is "+ price);
		
		fruit =  "mango";
		price = 5.99;
		//The price of the mango is 5.99
		System.out.println("The price of "+ fruit + " is "+ price);
		
		/* to attach any value (int, double, boolean, char, String etc)
		 * to a String we use +
		 * + next to a String act as a Concatenation
		*/
	}

}
