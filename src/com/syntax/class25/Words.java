package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

// Create an arrayList of words. Remove every word that ends with “e”.
public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("proof");
        words.add("sprite");
        words.add("litre");
        words.add("edition");
        words.add("mobile");

        //words.removeIf(item -> item.endsWith("e"));
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
