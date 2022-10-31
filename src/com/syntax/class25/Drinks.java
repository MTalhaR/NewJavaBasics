package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

// Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Sting");
        drinks.add("sprite");
        drinks.add("fanta");
        drinks.add("mango");
        drinks.add("7up");

        var iterator = drinks.iterator();
        int count = 0;
        while (iterator.hasNext()){
           String juice=iterator.next();
            if (juice.contains("a") || (juice.contains("e"))){
            drinks.set(count,"water");
            }
            count++;
        }
        System.out.println(drinks);
    }
}
