package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		//  Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars= {"Toyota","BMW","Audi","Honda","KIA","Nissan"};
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("----------------");
		
		for(String car:cars) {
			System.out.println(car);
		}
		
	}

}
