package com.syntax.class05;

public class LogicalAndRepl34 {

	public static void main(String[] args) {

        int n1=100;
        int n2=200;
        int n3=300;

        if(n1>n2 && n1>n3) {
            System.out.println(n1 +"is the largest");

        } else if (n2>n3 && n2>n1) {
            System.out.println(n2+" is the largest");

        } else if (n3>n1 && n3>n2) {
            System.out.println(n3 +" is the largest");

        }


    }
}