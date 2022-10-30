package com.syntax.class17;

public class HW1 {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    HW1(){
        System.out.println("Empty");
    }
    String name;
    int age;

    public HW1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void info(){
        System.out.println("My name and age are:"+name+" "+age);
    }



}
