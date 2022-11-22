package practice;

import java.util.Arrays;
import java.util.Random;

public class lillia216 {
        public static int[] ArraySumToZero(int N) {

            int[] num = new int[N];
            for(int i=1;i<N;i+=2){
                num[i]=i;
                num[i-1]=i*-1;

            }
            return num;
        }
        public static void main(String[]args){
            System.out.println(Arrays.toString(ArraySumToZero(4)));
        }

    }

