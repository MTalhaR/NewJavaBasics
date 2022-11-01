package replitTasks;

import java.util.LinkedList;
import java.util.List;

        /*Create a method that takes a list as a paramter removes an element if it starts with letter A from given List
          and return new List then in the main method print that list.
          [USA, Kazakhstan, Pakistan, Russia]*/
public class Task194List {
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        var iterator=countries.iterator();
        while (iterator.hasNext()){
            String item=iterator.next();
            if (item.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(countries);
    }
}
