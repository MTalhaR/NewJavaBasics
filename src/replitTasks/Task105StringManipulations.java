package replitTasks;

import java.util.Scanner;

public class Task105StringManipulations {
    /*
    There is a code that takes input as a String.   Write a program that will print out only vowels of that string
    Sample input/outputs:
    In: howdyho
    oo
    In: huehuehuehue
    ueueueue
    In: poopoo what idk what im doing
    ooooaiaioi
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.print(word.charAt(i));
            }
        }

    }
}
