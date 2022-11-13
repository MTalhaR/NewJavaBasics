package replitTasks;

import java.util.HashMap;

/*
Create HashMap
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
 map.put("mango", 40);
Using iterator retrieve all keys and values if the format below:
 */
public class Task203Map {
    public static void main(String[] args) {
        HashMap<String,Integer> fruits=new HashMap<>();
        fruits.put("mango", 10);
        fruits.put("apple", 30);
        fruits.put("orange", 20);
        fruits.put("mango", 40);
        fruits.put("mango", 40);
        var iterator=fruits.entrySet().iterator();
        while (iterator.hasNext()){
            var items=iterator.next();
            System.out.println("Key = "+items.getKey()+" and value = "+items.getValue());
        }
    }
}
