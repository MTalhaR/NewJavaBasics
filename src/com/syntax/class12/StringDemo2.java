package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+" "+lastName); // Mostly this is used
		System.out.println(firstName.concat(" ").concat(lastName));
		System.out.println(firstName.concat(" "+lastName));
		
		
		String str=" ";
		// isEmpty() returns true if a String is empty this method will return false even if you have a space 
		// in a String variable however the isBlank method does not count the spaces
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
	}

}
