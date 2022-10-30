package com.syntax.class11;

public class Student {
	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying.....");
	}
	
	void deleteMessages() {
		System.out.println("Deleting messages from Discord....");
	}
	
	void eat() {
		System.out.println("Eating pizzzzaaaa.....");
	}
	
	public static void main(String[] args) {
		//new Student() => Creates the object of Student class
		Student FraidoonObject=new Student();
		FraidoonObject.name="Fraidoon";
		FraidoonObject.id="123";
		FraidoonObject.age=22;
		
		System.out.println(FraidoonObject.name);
		System.out.println(FraidoonObject.age);
		FraidoonObject.deleteMessages();
		
		System.out.println("****************");
		
		Student student2=new Student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		System.out.println(student2.name);
		student2.eat();
		
		
	}
}
