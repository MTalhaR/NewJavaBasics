package replitTasks;

import java.util.HashMap;

/*
Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
 */
public class Task207Map {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
        var iterator=map.entrySet().iterator();
        var items=map.entrySet();
        for (var item:items) {
            System.out.println(item.getKey()+" : "+item.getValue());
        }
        System.out.println("------------------");
        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");
        System.out.println("HashMap After Replace :");
        var itemsRem=map.entrySet();
        for (var itemRem:itemsRem) {
            System.out.println(itemRem.getKey()+" : "+itemRem.getValue());
        }
    }
}
