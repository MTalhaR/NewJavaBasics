package com.syntax.class17;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    public Dog(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println("name "+name+" "+" breed "+" age "+age);
    }

    public static void main(String[] args) {
       /* Dog dog=new Dog();
        dog.name="Tomy";
        dog.breed="Huskey";
        dog.color="Pink";
        dog.age=10;
        dog.weight=30;*/
        Dog dog=new Dog("Tomy","Huskey","Pink",50,30);

        dog.printInfo();

      /*  Dog dog2=new Dog();
        dog2.name="Cmi";
        dog2.breed="German";
        dog2.color="Green";
        dog2.age=12;
        dog2.weight=30;*/
        Dog dog2=new Dog("Cmi","German","Green",12,30);
        dog2.printInfo();

    }
}
