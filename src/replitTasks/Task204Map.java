package replitTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
 */
public class Task204Map {
    public static void main(String[] args) {
        var objects=new LinkedHashMap<>();
        objects.put("Street","Patrick ST");
        objects.put("Suite","265");
        objects.put("City","Vienna");
        objects.put("Zip","22180");
        objects.put("Country","United State");
        var iterator=objects.values().iterator();
        while (iterator.hasNext()){
            var items=iterator.next();
            System.out.println(items);
        }
    }
}
