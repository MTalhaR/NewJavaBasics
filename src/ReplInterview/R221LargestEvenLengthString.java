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

            System.out.println(findMaxLenEven("find MaxLen Even"));
        }

        public static String findMaxLenEven(String str) {
            var S=str.split("i");

            var s=str.toCharArray();
            for (int i = 0; i < s.length; i++) {

            }
        return str;
        }
}
