package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

// Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i<=500; i+=2){
            numbers.add(i);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next%5==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
