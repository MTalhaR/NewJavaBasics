package com.syntax.class16;

public class HW3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private static String vowels(String abc){
        String newstr=abc.replaceAll("[^aeiouAEIOU]","");
        return newstr;
    }

    public static void main(String[] args) {
        String abc="ajeiokdhjkAUIOEUWNDasghdjeiokhsajkh";
        System.out.println(vowels(abc));
    }
}
