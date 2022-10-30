package com.syntax.class18;

public class StudentHW {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    public StudentHW(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Name is "+name+" and he live in "+address);
    }

    public static void main(String[] args) {
        new StudentHW("Talha","House D-59, Wah Cantt").displayInfo();
    }
}
