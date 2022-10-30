package com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {
		
		double money=5;
		boolean isHungry=true;
		double kfcBurger=11;
		
		if(money>kfcBurger) {
			System.out.println("yayy i can enjoy a burger");
		}
		else {
			System.out.println("I should make something at home");
		}
		
		if (false) {
			System.out.println("If block");
		}
		else {
			System.out.println("else block");
		}
		
		isHungry= true;
		
		if(isHungry) {
			System.out.println("Lets eat something yummy");
		}
		else {
			System.out.println("Lets watch and do some coding from Youtube");
		}
		
		
		

	}

}
