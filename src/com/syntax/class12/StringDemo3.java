package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="   i love java";
		System.out.println(str);
		// Remove the spaces before and after the String but not the ones which are present in between
		System.out.println(str.trim());
		
		
		String str2="Java is Very easy";
		System.out.println(str2.startsWith("Java"));
		System.out.println(str2.endsWith("easy"));
		System.out.println(str2.contains("very"));
		// Method chaining helps us call multiple methods in single line on method after an other 
		System.out.println(str2.toLowerCase().contains("very"));
	}

}
