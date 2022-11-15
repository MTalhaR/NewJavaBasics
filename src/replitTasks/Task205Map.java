package replitTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/*
Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
 */
public class Task205Map {
    public static void main(String[] args) {
        var objects=new HashMap<String,String>();
        objects.put("Street","Patrick ST");
        objects.put("Suite","265");
        objects.put("City","Vienna");
        objects.put("Zip","22180");
        objects.put("Country","United State");

        for (Map.Entry<String,String> item:objects.entrySet()) {
            System.out.println(item.getValue().toUpperCase());
        }
    }
}
