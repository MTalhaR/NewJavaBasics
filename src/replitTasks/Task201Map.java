package replitTasks;
import java.util.HashMap;
/*
Create a Map in which you do not need to preserve the order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
 */
public class Task201Map {
    public static void main(String[] args) {
        var objects=new HashMap<>();
        objects.put("Street","Patrick ST");
        objects.put("Suite","265");
        objects.put("City","Vienna");
        objects.put("Zip","22180");
        objects.put("Country","United State");
        System.out.println(objects.size());
        objects.clear();
        System.out.println(objects.size());
    }
}
