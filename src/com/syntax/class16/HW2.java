package com.syntax.class16;

public class HW2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String rev(String str){
       /* StringBuilder rev=new StringBuilder(str);
        String s=rev.reverse().toString();
        return s;        */
    return new StringBuilder(str).reverse().toString();

    }

    public String reversed(String a){
        String b="";
        for (int i=a.length()-1; i>=0; i--){
        b=b+a.charAt(i);
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(HW2.rev("Reversed String"));
        HW2 value=new HW2();
        System.out.println(value.reversed("Reversed String"));
    }
}
