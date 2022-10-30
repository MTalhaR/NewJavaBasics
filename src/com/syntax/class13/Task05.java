package com.syntax.class13;

public class Task05 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true
		//Abbc =>false

		String str = "madam";
		String reverse = "";
		for (int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
			if (str.equals(reverse)) {
				System.out.println("It is a palindrome String");
			} else {
				System.out.println("It is not a palindrome string");
			}

		String str1="dad";
		StringBuilder stringBuilder=new StringBuilder(str1);
		stringBuilder.reverse();
		if (stringBuilder.toString().equals(str1)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");}


		}
	}

