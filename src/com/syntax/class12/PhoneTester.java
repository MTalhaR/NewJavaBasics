package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// if class who's object we are creating is present inside same package, we don't need to import it.
		  
		Phone iphone=new Phone();
		
		iphone.make="Apple";
		iphone.model="Iphone 14 pro max";
		iphone.year=2022;
		iphone.storage=128;
		iphone.makeCall();
		
		//new Phone()=> To create the object
		Phone samsung=new Phone();
		samsung.model="S22 Ultra";
		samsung.make="Samsung";
		samsung.year=2022;
		samsung.makeCall();
		
		
	}

}
