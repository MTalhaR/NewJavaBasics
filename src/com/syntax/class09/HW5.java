package com.syntax.class09;

public class HW5 {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order
		
		char[] values= {'A', 'B', 'C', 'D'};
		for(int i=values.length-1; i>=0; i--) {
			System.out.println(values[i]);
		}
		
	}

}
