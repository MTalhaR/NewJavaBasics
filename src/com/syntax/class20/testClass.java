package com.syntax.class20;

public class testClass {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
    Use separate class to test your code
     */
    public static void main(String[] args) {
        area obj = new area();
        obj.Area(5);
        obj.Area(5,10);
        obj.Area(5,10,8);
    }
}

class area{
    void Area(int length, int height){
        System.out.println(length*height);
    }
    void Area(int length){
        System.out.println(length*length);
    }
    void Area(int length, int width, int height){
        System.out.println(length*width*height);
    }
}
