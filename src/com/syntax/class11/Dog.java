package com.syntax.class11;

public class Dog {
	
	//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	String name;
	String color;
	String breed;
	
	//These are the behavior of a dog
	void bark () {
		System.out.println("Barking...........");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping..........");
	}
	
	void eat() {
		System.out.println("Dog is eating......");
	}
	
	public static void main(String[] args) {
		//creating objects from a class
		Dog dog1=new Dog();
		//calling a behavior on an object
		dog1.name="Tommy";
		dog1.color="Black";
		dog1.breed="Husky";
		dog1.bark();
		dog1.sleep();
		
		Dog dog2=new Dog();
		dog2.name="Hodge";
		dog2.color="Grey";
		dog2.breed="Bulldog";
		dog2.eat();
		
		Dog dog3=new Dog();
		dog3.name="Nelson";
		dog3.color="Brown";
		dog3.breed="Labrador";
		System.out.println(dog3.name+" is a "+dog3.breed+" and it has "+dog3.color+" color");
	}
	
}
