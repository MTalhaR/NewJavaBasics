package com.syntax.class28;

import java.util.HashMap;

/*
Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class HW1 {
    public static void main(String[] args) {
        HashMap<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Amazon");
        building.put(4,"Netflix");
        building.put(5, "Syntax");
        building.put(1,"Amazon");
        building.put(7,"Lenovo");
        System.out.println("Total no. of floors in building are "+building.size());
        building.replace(4,"Dell");
        building.remove(7);
        System.out.println(building);
    }
}
