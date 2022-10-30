package com.syntax.Class14;

public class Task04 {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed
    boolean Hello(String country){
        switch (country) {
            case "Pakistan" -> System.out.println("AOA");
            case "India" -> System.out.println("Namaste");
            case "Japan" -> System.out.println("konichiwa");
            case "Turkiye" -> System.out.println("mehraba");
            default -> System.out.println("Invalid country");
        }
        return true;
    }
    public static void main(String[] args) {
        Task04 hello=new Task04();
        hello.Hello("Pakistan");
        hello.Hello("jausus");
    }
}
