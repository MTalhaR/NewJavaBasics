package com.syntax.class12;

public class Task4 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday => yadnuS).
		
		String str="Sunday";
		String reverse = new String();
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
			reverse+=str.charAt(i);
			
		}
		System.out.println();
		System.out.println(reverse);
		
		char [] charArr=str.toCharArray();
		
		for(int i=charArr.length-1; i>=0; i--) {
			System.out.print(charArr[i]);
		}
		
	}

}
