package com.syntax.class19;

public class Shape {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    int radius;

    public Shape(int radius) {
        this.radius = radius;
    }
}
class circle extends Shape{
    double pi;

    public circle(int radius, double pi) {
        super(radius);
        this.pi=pi;
    }
    void print(){
        System.out.println(pi*(radius*radius));
    }

    public static void main(String[] args) {
        new circle(20,3.14).print();
    }
}
