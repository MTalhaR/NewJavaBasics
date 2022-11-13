package replitTasks;

import java.util.LinkedHashSet;

/*
Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair
Print values 1 by 1 using loop and Iterator
 */
public class Task199Set {
    public static void main(String[] args) {
        LinkedHashSet<String> obj=new LinkedHashSet<>();
        obj.add("null");
        obj.add("Sohil");
        obj.add("Diego");
        obj.add("Alijon");
        obj.add("Asel");
        obj.add("Sumair");
        for (String object:obj) {
            System.out.println(object);
        }
        var items=obj.iterator();
        while (items.hasNext()){
            var item=items.next();
            System.out.println(item);
        }
    }
}
