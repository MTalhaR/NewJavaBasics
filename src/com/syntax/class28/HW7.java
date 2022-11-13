package com.syntax.class28;

import java.util.LinkedList;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class HW7 {
    public static void main(String[] args) {
        LinkedList<Integer> num=new LinkedList<>();
        num.add(10);
        num.add(20);
        num.add(50);
        num.add(10);
        num.add(25);
        num.add(20);
        num.add(60);
        int sum=0;
        for (var numbers:num) {
            sum+=numbers;
        }
        System.out.println("Sum is "+sum);
    }
}
