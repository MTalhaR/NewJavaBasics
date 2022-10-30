package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		int time=5;
		String day="Monday";		// as string is a non-primitive data type we can't use == sign, we have to use .equals method
		if (day.equals("Monday"))   // outer If condition
		{
			if (time>7)             // inner If condition
			{
				System.out.println("Lets go to office");  
			}
			if (time<6) 
			{
				System.out.println("Lets sleep more");
			}
		}
		
	}

}
