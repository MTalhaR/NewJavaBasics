package practice;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        String str="Hello World";
        String rev="";
        String[] arr=str.split(" ");
        //System.out.println(Arrays.asList(arr));
        for (int i = arr.length-1; i >= 0 ; i--) {
            rev+=arr[i]+" ";
            //System.out.println(rev);
        }
        System.out.println(rev);
    }
}
