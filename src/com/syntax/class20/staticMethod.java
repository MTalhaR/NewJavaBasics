package com.syntax.class20;

public class staticMethod {
    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with
    specific arguments and observe result.
     */

    static void print(int a){
        System.out.println(a);
    }
    static void print(int a, int b){
        System.out.println(a+b);
    }
    static void print(int a, double b){
        System.out.println(a+b);
    }
}
class testStatic{
    public static void main(String[] args) {
        staticMethod.print(2);
        staticMethod.print(2,6);
        staticMethod.print(6,5.4);

    }
}
