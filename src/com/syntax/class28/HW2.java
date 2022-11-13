package com.syntax.class28;

import java.util.TreeMap;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */
public class HW2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Pakistan", "Islamabad");
        countries.put("China", "Beijing");
        countries.put("Turkey", "Istanbul");
        countries.put("Germany", "Berlin");
        countries.put("Sweden", "Stockholm");
        System.out.println("Keys and Values using FOR LOOP");
        var capital = countries.entrySet();
        for (var country : capital) {
            System.out.println(country.getKey() + " -> " + country.getValue());
        }
        System.out.println("Keys and Values using ITERATOR");
        var values = countries.entrySet().iterator();
        while (values.hasNext()) {
            var item = values.next();
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
        System.out.println("All Values using FOR LOOP");
        var capitals = countries.values();
        for (var country : capitals) {
            System.out.print(country+" , ");
        }
        System.out.println();
        System.out.println("All Values using ITERATOR");
        var value = countries.values().iterator();
        while (value.hasNext()) {
            var items = value.next();
            System.out.print(items+" , ");
        }
    }
}