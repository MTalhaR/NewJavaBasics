package replitTasks;

import java.util.TreeMap;

/*
Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
 */
public class Task202Map {
    public static void main(String[] args) {
        TreeMap<String,String> objects=new TreeMap<>();
        objects.put("1 item","apple");
        objects.put("2 item","banana");
        objects.put("3 item","pear");
        objects.put("4 item","tomato");
        objects.put("5 item","mango");
        objects.put("6 item","kiwi");
        var items=objects.entrySet();
        for (var item:items) {
            System.out.println("Key is "+item.getKey()+" and values is "+item.getValue());
        }

    }
}
