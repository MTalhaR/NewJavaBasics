package com.syntax.class20;

public class privateMethod {
    /*
    Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method
    with specific arguments and observe result.
     */
    private void display(String name) {
        System.out.println(name);
    }

    private void display(boolean happy) {
        System.out.println(happy);
    }

    private void display(int age) {
        System.out.println(age);
    }

    public static void main(String[] args) {
        privateMethod obj = new privateMethod();
        obj.display("talha");
        obj.display(25);
        obj.display(true);
    }
}
