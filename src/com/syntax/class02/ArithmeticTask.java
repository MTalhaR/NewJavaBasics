package com.syntax.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task number 1
		double num1 = 4.5;
		double num2 = 2.5;
		double sum = num1+num2;
		double sub = num1-num2;
		double multiplication = num1*num2;
		double div = num1/num2;
		
		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + multiplication);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
		
		//Task number 2
		double num=3.9;
		double square = num*num;
		System.out.println("The square of the " + num + " is " + square);
		double S = Math.pow(num, 2);
		System.out.println("The square of the " + num + " is " + S);
		
		//Task number 3
		int width = 5;
		int height = 8;
		int perimeter = 2*(width+height);
		int area = width * height;
		
		System.out.print("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + perimeter + " and the area is " + area);
		
	}

}
