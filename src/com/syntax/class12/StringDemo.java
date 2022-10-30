package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Proper way of creating an object
		String str=new String("Java");
		
		//Simpler and shorter way provided by Java Creators to make our life a little easier
		String name="Muhammad Talha Riaz"; //Only works for String and Wrapper classes
		
		System.out.println(str.length());
		System.out.println(name.length());
		
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}
		
		
	}

}
