package com.syntax.class12;

public class Phone {
	
	String make;
	String model;
	String color;
	int year;
	int storage;
	
	void makeCall() {
		System.out.println("Making a call using "+model);
	}
	
	void takePictures() {
		System.out.println("Taking picture with "+model);
	}
	
	void browseInternet() {
		System.out.println("Browsing the internet on "+model);
	}
}
