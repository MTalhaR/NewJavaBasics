package com.syntax.class04;

public class NestedIfCondition2 {

	public static void main(String[] args) {
		
		double moneyInMyAccount=10000;
		String season="Spring";
		
		if (season.equals("Spring"))
		{
			if (moneyInMyAccount>30000)
			{
				System.out.println("let's go vacations");
			}
			else
			{
				System.out.println("I need to save more");
			}
		
		}
		

	}

}
