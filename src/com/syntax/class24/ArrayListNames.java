package com.syntax.class24;

import java.util.ArrayList;

/*
    Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that
     */
public class ArrayListNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Talha");
        names.add("Abdul");
        names.add("Atika");
        names.add("Khan");
        names.add("Basak");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Atika"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
