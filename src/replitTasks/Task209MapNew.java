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

        /*var iterator=dataList.iterator();
        //var iterator = dataList.listIterator();
        while (iterator.hasNext()){
            var eachMap = iterator.next();*/

        //creating loop for dataList and casting each KEY
            for (var eachMap:dataList) {
            Object price = eachMap.get("Price");
            double eachPrice = (double) price;

            Object quantity = eachMap.get("Quantity");
            double eachQuantity = (double) quantity;

            Object items = eachMap.get("Items");
            String item = (String) items;

            //calculating subtotal
            subtotal = eachPrice*eachQuantity;
            sum+=subtotal;

            System.out.println("Items: "+item+" Price: "+eachPrice+" Quantity: "+eachQuantity+" SubTotal: "+subtotal);
            System.out.println();

        }
        System.out.println("Your Purchase total : "+sum);

    }
}
