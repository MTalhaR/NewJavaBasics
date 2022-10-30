package replitTasks;

import java.util.Scanner;

public class Task101StringManipulations {
    /*
    Inputs: String word;
    Write a for loop that will print out every other letter in a String, starting with the first letter.
    These letters should be printed all on one line with no space in between. Sample input/outputs
    In: hello
    hlo
    In: SSyynnttaaxxTTeecchhnnoollooggiieess
    SyntaxTechnologies
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(word.charAt(i));
            }
        }
    }
}
