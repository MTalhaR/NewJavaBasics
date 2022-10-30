package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int[] num= {35, 23, 67, 11, 99, 33};
		int largest=0;
		for(int numbers:num) {
			if(largest<numbers) {
				largest=numbers;
			}
			
		}
		System.out.println(largest);
		
	}

}
