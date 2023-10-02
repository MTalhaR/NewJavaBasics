package Assessments;

/*
 * Have the function PermutationStep(num) take the num parameter being passed and return the next number greater than num using the same digits.
 * For example: if num is 123 return 132, if it's 12453 return 12534. If a number has no greater permutations, return -1 (ie. 999).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static int PermutationStep(int num) {
        // Convert the integer to a character array
        char[] digits = Integer.toString(num).toCharArray();

        // Find the rightmost digit that is smaller than its neighbor to the right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no such digit is found, return -1
        if (i < 0) {
            return -1;
        }

        // Find the smallest digit to the right of i that is greater than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap digits[i] and digits[j]
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Reverse the digits to the right of i
        Arrays.sort(digits, i + 1, digits.length);

        // Convert the character array back to an integer
        int result = Integer.parseInt(new String(digits));


        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(PermutationStep(s.nextInt()));
    }

        /*char[] value = Integer.toString(num).toCharArray();

        int i = value.length-2;
        while (i>=0 && value[i] >= value[i+1]){
            i--;
        }

        if (i<0) {
            return -1;
        }

        int j = value.length -1;
        while (value[j] <= value[i]){
            j--;
        }

        char digit = value[i];
        value[i] = value[j];
        value[j] = digit;

        Arrays.sort(value,i+1,value.length);

        int result = Integer.parseInt(new String(value));

        return result;
    }

    public static void main (String[] args) {
        // keep this function call here

        System.out.print(PermutationStep(41352));
    }*/
}
