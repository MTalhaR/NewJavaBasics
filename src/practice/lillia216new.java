package practice;

import java.util.ArrayList;

public class lillia216new {
    public static int[] ArraySumToZero(int N) {

        ArrayList<Integer> numbersEven=new ArrayList<>();
        for(int i=1;i<=N;i+=2){
            numbersEven.add(i);
            numbersEven.add(i*-1);
        }

        int[] arr = numbersEven.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    public static void main(String[]args){
        System.out.println(ArraySumToZero(9));
    }


}
