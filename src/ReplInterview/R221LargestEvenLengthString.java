package ReplInterview;

import java.util.Arrays;

/* Find the largest even length word from a String
    if there are two words with same largest even length return the first one.
    if there are not even words return -1
    input ["find MaxLen Even"]
    output ["MaxLen"]
    input["I am very Good at Java"]
    output ["very"]
    input["I was"]
    output ["-1"] */
public class R221LargestEvenLengthString {
        public static void main(String[] args) {

            System.out.println(findMaxLenEven("Hello world!"));
        }

    public static String findMaxLenEven(String str) {

        String[] words=str.split(" ");
        String largest="";
        for (String word:words){
            if(word.length()>largest.length() && word.length()%2==0){
                largest=word;
            } else if (word.length()%2!=0){
                System.out.println(-1);
            }
        }
        return largest;
    }
}
