package com.syntax.class28;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class HW6 {
    public static void main(String[] args) {
        LinkedHashSet<String> objects=new LinkedHashSet<>();
        objects.add("It's");
        objects.add("getting");
        objects.add("really");
        objects.add("hectic");
        objects.add("but");
        objects.add("we");
        objects.add("can");
        objects.add("do");
        objects.add("it");
        for (String obj:objects) {
            System.out.print(obj+" ");
        }
    }
}
