package replitTasks;

import java.util.*;

public class Task209MapNew {
    public static void main(String[] args) {
        // creating a List that will contain map
        List<Map<String, Object>> dataList=new ArrayList<>();
        //creating first map called apple and adding items into it
        Map<String, Object>appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple" );
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);
        //adding apple Map to dataList
        dataList.add(appleMap);

        //creating second map called orange and adding items into it
        Map<String, Object>OrangeMap=new LinkedHashMap<>();
        OrangeMap.put("Items","Orange" );
        OrangeMap.put("Price",21.99);
        OrangeMap.put("Quantity",10.0);
        //adding orange Map to dataList
        dataList.add(OrangeMap);
        //initializing sum variables to be used inside the loop
        double subtotal=0;
        double sum=0;

        //creating loop for dataList and casting each KEY
            for (var eachMap:dataList) {
                // getting the value of PRICE key
            Object price = eachMap.get("Price");
            //casting it to double
            double eachPrice = (double) price;
                // getting the value of Quantity key
            Object quantity = eachMap.get("Quantity");
                //casting it to double
            double eachQuantity = (double) quantity;
                // getting the value of Items key
            Object items = eachMap.get("Items");
                //casting it to String
            String item = (String) items;

            //calculating subtotal
            subtotal = eachPrice*eachQuantity;
            // calculating the TOTAL PURCHASE
            sum+=subtotal;

            System.out.println("Items: "+item+" Price: "+eachPrice+" Quantity: "+eachQuantity+" SubTotal: "+subtotal);
            System.out.println();

        }
        System.out.println("Your Purchase total : "+sum);

    }
}
