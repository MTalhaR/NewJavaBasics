package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
		
		int[] num= {5,10,15,20};
		System.out.println(num[0]+num[1]+num[2]+num[3]);
		
		System.out.println("-----------------");
		
		int sum=0;
		
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		System.out.println(sum);
	}

}
