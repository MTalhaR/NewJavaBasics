package com.syntax.class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class HW3 {
    public static void main(String[] args) {
        HashMap<Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");
        bestBuy.put(7844526,"Laptop");
        bestBuy.put(7485516,"Mobiles");
        bestBuy.put(7656452,"Cameras");
        Set<Map.Entry<Integer,String>> items=bestBuy.entrySet();
        for (var item:items
             ) {
            System.out.println(item.getKey()+ " -> " +item.getValue());
        }
    }
}
