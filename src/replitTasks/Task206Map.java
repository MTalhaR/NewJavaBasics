package replitTasks;

import java.util.HashMap;
import java.util.Map;

/*
Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
 */
public class Task206Map {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        var items=map.entrySet();
        for (var item:items) {
            System.out.println(item.getKey()+" : "+item.getValue());
        }
        System.out.println("------------------");
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("HashMap After Remove :");

        for (var itemRem: map.entrySet()) {
            System.out.println(itemRem.getKey()+" : "+itemRem.getValue());
        }
    }
}
