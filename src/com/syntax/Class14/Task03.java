package com.syntax.Class14;

public class Task03 {
    //Create a method that will print whether given String is palindrome or not.
    boolean palindrome(String str){
        StringBuilder newstr=new StringBuilder(str);
        newstr.reverse();
        if (str.equalsIgnoreCase(newstr.toString())){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a plindrome");
        }
        return true;
    }

    public static void main(String[] args) {
        Task03 s=new Task03();
        s.palindrome("Mom");
    }
}
