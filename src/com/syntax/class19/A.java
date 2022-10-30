package com.syntax.class19;

public class A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    String name;
    int age;
    String address;

    public A(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
class B extends A{
    int siblings;
    public B(String name, int age, String address, int siblings) {
        super(name, age, address);
        this.siblings=siblings;
    }
}
class C extends B{
    String occupation;
    public C(String name, int age, String address, int siblings, String occupation) {
        super(name, age, address, siblings);
        this.occupation=occupation;
    }
    void print(){
        System.out.println(name+" "+age+" "+address+" "+siblings+" "+occupation);
    }
}
class testABC {
    public static void main(String[] args) {
        C c = new C("Talha", 25, "Pakistan", 6, "Studying");
        c.print();
    }
}
