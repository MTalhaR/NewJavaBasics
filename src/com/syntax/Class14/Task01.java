package com.syntax.Class14;

public class Task01 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void LarNum(int n1, int n2){
        if (n1>n2){
            System.out.println(n1 +" is larger number");
        }else if (n1<n2){
            System.out.println(n2 +" is larger number");
        } else{
            System.out.println("Both are equal");
        }
    }

    public static void main(String[] args) {
        Task01 num=new Task01();
        num.LarNum(65,65);
    }
}
