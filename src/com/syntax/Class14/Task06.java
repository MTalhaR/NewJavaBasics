package com.syntax.Class14;

public class Task06 {
    //Write a method to return whether given number is prime or not?
    boolean isPrime(int num){
        boolean isPrime=true;
        if (num>1){
            for (int i=2; i<num; i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
                }
            }
        return isPrime;
    }

    public static void main(String[] args) {
        Task06 num=new Task06();
        System.out.println(num.isPrime(25));
    }
}
