package com.syntax.class13;

public class Task01 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		String line="This is not going well";
		String newLine=line.replaceAll(" ", "");
		System.out.println(newLine);
	}

}
