package com.syntax.Class14;

public class Task3 {

    boolean palindrome(String word) {
        StringBuilder w = new StringBuilder(word);

        if (word.equalsIgnoreCase(w.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Task3 pl = new Task3();
        String a = "mom";

        if (pl.palindrome(a)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
}
