package com.syntax.Class14;

public class Task02 {
    //Create a method that will take a number and prints whether the number is even or odd.
    void EvenOdd(int num){
        if (num%2==0){
            System.out.println(num+" is even");
        }else System.out.println(num+" is odd");
    }

    public static void main(String[] args) {
        Task02 num=new Task02();
        num.EvenOdd(26);
    }
}
