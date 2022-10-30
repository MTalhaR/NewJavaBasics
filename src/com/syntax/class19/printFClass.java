package com.syntax.class19;

public class printFClass {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    static void printF(){
        System.out.println("Syntax");
    }
}
class newClass extends printFClass{
}
class testClass{
    public static void main(String[] args) {
        printFClass.printF();
    }
}
