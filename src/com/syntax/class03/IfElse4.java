package com.syntax.class03;

public class IfElse4 {

	public static void main(String[] args) {
		
		/*
		 *  < less than
		 *  > greater than
		 *  <= less than or equal to
		 *  >= greater than or equal to
		 *  == equal to
		 *  != not equal to
		 */
		
		int money=66000;
		
		if(money>=65000) {
			System.out.println("I can buy a Tesla");
		}
		else {
			System.out.println("I need to save more");
		}
		
		if(money==65000){
			System.out.println("I can buy a Tesla");
		}
		else {
			System.out.println("I need to save more");
		}
	}

}
