package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st way to create variable
		byte b = 10; // create a variable and assign value
		
		// 2nd way to create variable
		int i; // create a variable
		i = 100; // assign value
		// we need to create a variable only once 
		//then we can use it as many times we want/need during the program
		
		// 3rd way to create variable
		int num1, num2, num3; // create a variable or declare a variable
		num1 = 100; // assign value or initialize variable
		num2 = 200;
		num3 = 300;
		
		System.out.println(num2);
		
		// can i change a value of a variable???
		num2 = 2000; // reassign the value
		
		System.out.println(num2);
		System.out.println(num1+num3);
		System.out.println(b*i);
	}

}
