package com.syntax.class11;

public class Phone {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
	String make;
	String model;
	String color;
	
	
	void call() {
		System.out.println("calling........");
	}
	
	void takePicture() {
		System.out.println("Taking pictures");
	}
	
	void message() {
		System.out.println("messaging......");
	}
	
	public static void main(String[] args) {
		//Name of class variable name = new name of class ();
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 14";
		iphone.color="Black";
		
		System.out.println("Make "+iphone.make+" Model "+iphone.model);
		iphone.call();
		
		System.out.println();
		System.out.println("*******************");
		System.out.println();
		
		Phone SamsungPhone=new Phone();
		SamsungPhone.make="Samsung";
		SamsungPhone.model="S22 Ultra";
		SamsungPhone.color="Grey";
		
		System.out.println();
		System.out.println("*******************");
		System.out.println();
		
		Phone PixelPhone=new Phone();
		PixelPhone.make="Pixel";
		PixelPhone.model="Pixel 5";
		PixelPhone.color="White";
		
		System.out.println(iphone.make);
		
		System.out.println(SamsungPhone.make);
		
		System.out.println(PixelPhone.make);
	}
}
