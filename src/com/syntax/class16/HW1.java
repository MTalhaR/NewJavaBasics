package com.syntax.class16;

public class HW1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    int sum(int arr[]){
        int sum=0;
        for (int num:arr){
            sum+=num;

        }
        return sum;
    }
    public static void main(String[] args) {
        HW1 num=new HW1();
        int[]arr={1,2,3,4,5};
        System.out.println(num.sum(arr));
    }
}
