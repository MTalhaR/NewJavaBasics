package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		
		/*
		 * type casting => type = data type casting converting
		 */
		
		byte box1=127; //smallest box
		short box2=3333; // smallest box
		int box3=45454545; // large box most commonly used
		long box4=45454545; // slightly large box
		float box5=414564545; // larger box
		double box6=454545445; //largest
		
		int number = (int)15.2; // we can't store the decimal number in a box of type double
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		System.out.println(biggerBox);
		
		long box7=box1; // we can do this because box7 is larger than box1
		System.out.println(box7);
		
		float box8=(float)box6; // as box6 is larger, it is double, we need type casting to assign value
		System.out.println(box8);
		
		char a=(char)55;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		short box=167;
		byte box0=(byte)box2;
		System.out.println(box2);
		
		/*
		 * What is type casting?
		 * type casting is converting one data type to another data type
		 * Why should i learn about type casting?
		 * so that we can use the code that is written by someone else to make our life easier
		 * or when we will be working in teams we will be able to marge the code
		 * What is syntax for type casting?
		 * when we are converting something smaller to larger we don't need to do anything
		 * it happens automatically we just assign the variable for example
		 * 
		 * int box=1234;
		 * long box2=box; // this is how it works and it is called implicit or widening automatic
		 * 
		 * however when we convert a larger data type to a smaller data type then this is how we do it
		 * long box=1245454;
		 * int box2=(int)box; narrowing or explicit or manual conversion
		 */
		
		

	}

}
