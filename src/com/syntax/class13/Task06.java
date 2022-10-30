package com.syntax.class13;

public class Task06 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?

		String a="Hello";
		String b="Bye";
		System.out.println("String 1 = "+a);
		System.out.println("String 2 = "+b);
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println("String 1 = "+a);
		System.out.println("String 2 = "+b);

		System.out.println("---------------------");

		String str1="Python";
		String str2="Java";
		str1=str1+str2;
		str2=str1.replace(str2,"");
		str1=str1.replace(str2,"");
		System.out.println(str1);
		System.out.println(str2);
	}

}
