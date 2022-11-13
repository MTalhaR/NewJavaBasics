package replitTasks;

import java.util.LinkedHashMap;

/*
Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
 */
public class Task200Map {
    public static void main(String[] args) {
        var objects=new LinkedHashMap<>();
        objects.put("Street","Patrick ST");
        objects.put("Suite","265");
        objects.put("City","Vienna");
        objects.put("Zip","22180");
        objects.put("Country","United State");

        var obj=objects.values();
        for (var object:obj) {
            System.out.println(object);
        }
    }
}
