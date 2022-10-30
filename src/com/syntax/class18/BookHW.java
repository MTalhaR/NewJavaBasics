package com.syntax.class18;

public class BookHW {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    String name;
    int age;

    public BookHW(String name) {
        this.name = name;
       // System.out.println("Name is "+name);
    }

    public BookHW(int age) {
        this.age = age;
       // System.out.println("Age is "+age);
    }
    void print(){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
       BookHW obj= new BookHW("Talha");
        obj.print();
       BookHW obj1= new BookHW(25);
    }
}
