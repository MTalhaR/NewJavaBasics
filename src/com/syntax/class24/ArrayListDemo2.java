package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // Collection FrameWork does not store primitive data types
        //ArrayList<int> numbers=new ArrayList<int>();
        // so we call the classes which are pre-built to use them as follows
        // int =>Integer
        // boolean => Boolean
        // byte => Byte
        // double => Double
        //long => Long
        //float => Float
        //char => Character
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);


        for(Integer num:numbers){
            System.out.println(num);
        }
        /*for (int num:numbers){
            System.out.println(num);
        }*/

        //int => Integer
        // boolean => Boolean
        // byte => Byte
        // double => Double
        // long => Long
        // float => Float
        // char => Character
    }
}
