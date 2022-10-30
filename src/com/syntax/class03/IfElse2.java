package com.syntax.class03;

public class IfElse2 {

	public static void main(String[] args) {
		
		boolean isHungry=true;
		
		if(isHungry) 
			System.out.println("Lets eat something yummy");
		
		if(3>2)
			System.out.println("There is a true statement inside parathesis");
		
		
		double myBankBalance=2000;
		double theAmountThatIWantToTransfer=250;
		
		if(myBankBalance > theAmountThatIWantToTransfer)
		System.out.println("Funds transfered successfully");
		
		else
			System.out.println("Please try again not enough balance");
		
		
	}

}
