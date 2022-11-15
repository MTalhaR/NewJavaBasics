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
        while (iterator.hasNext()){
            var items=iterator.next();
            System.out.println(items.getKey()+" : "+items.getValue());
        }

        System.out.println("------------------");
        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");
        System.out.println("HashMap After Replace :");
        var iterator1=map.entrySet().iterator();
        while (iterator1.hasNext()){
            var items1=iterator1.next();
            System.out.println(items1.getKey()+" : "+items1.getValue());
        }
    }
}
