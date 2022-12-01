package ReplInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
    /* Write the logic that picks largest and second largest numbers from a list add them and return the results.
     input to method is a list that contains the numbers
    input [10,20,30,40]
    output [70]
    input[5,3,8,9,10,11,5]
    output [21] */
public class R222MaxSum {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(5);
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        int LarNum = 0;
        int SecLarNum = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>LarNum){
                SecLarNum=LarNum;
                LarNum= list.get(i);
            } else if (list.get(i)>SecLarNum) {
                SecLarNum= list.get(i);
            }
        }

        return LarNum+SecLarNum;
    }
}
