package ReplInterview;

import java.util.*;

/* Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.
    Input [12,12,13,45,78,7,7] output 2
    Input [12,12,7,7,7,7,7] output 2
    Input [12,120,13,45,78,17,57] output 0
    Input [12,12,13,45,78,67,87] output 1 */
public class R217CountDuplicateNumbers {
        public static void main(String[] args ){
            ArrayList<Integer> numbers=new ArrayList<>();
            numbers.add(12);
            numbers.add(12);
            numbers.add(7);
            numbers.add(7);
            numbers.add(7);
            numbers.add(7);
            numbers.add(7);
            System.out.println(countDuplicates(numbers));
        }
        static int countDuplicates(List<Integer> numbers){
            HashSet<Integer> num=new HashSet<>();
                for (int i = 0; i < numbers.size(); i++) {
                    for (int j = 0; j < i; j++) {
                        if (numbers.get(i)==numbers.get(j)){
                            num.add(numbers.get(i));
                        }
                    }
                }
            int size=num.size();
            return size;
        }
}