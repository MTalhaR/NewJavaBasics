package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * true && true --> TRUE
		 * true && false --> FALSE
		 * false && true --> FALSE
		 * false && false --> FALSE
		 */
		
		boolean understandJava=false;
		boolean enjoyJava=true;
		boolean practice=true;
		if(understandJava && enjoyJava && practice) {
			System.out.println("This is awesome");
		}

	}

}
