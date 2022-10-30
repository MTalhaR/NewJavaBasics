package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		
		String str="I am always confused";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("w"));
		
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 11));
		
		int num=123123123;
		
		String numStr=String.valueOf(num).substring(2, 5);
		System.out.println(numStr);
		
		num=Integer.parseInt(numStr);
		System.out.println(num);
		
	}

}
