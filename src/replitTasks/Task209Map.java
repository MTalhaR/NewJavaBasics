package replitTasks;

import java.util.*;

/*Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList.
Step 2: Create appleMap<String, Object> and add below pairs into it.
"Items", "Apple"
"Price", 20.00
"Quantity", 10
Step 3: Add appleMap to dataList.
Step 4: Create orangeMap<String, Object> and add below pairs into it.
"Items", "Orange"
"Price", 21.99
"Quantity", 10
Step 5: Add orangeMap to dataList.
Step 6: Create a loop from dataList.
Step 7: Retrieve each Key and store is in a variable.
Step 8: calculate the subtotal of each object.
Step 9: Print the values of each Iteration same as shown below in Output example.
Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase.
Step 11: After Loop Print the value of Total Purchase.
**NOTE: as the values are Object you have to do casting properly while retrieving from for each map.**
Output:
Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
Your Purchase total : 419.9*/
public class Task209Map {
    public static void main(String[] args) {
        // creating a List that will contain map
        ArrayList<Map<String,Object>> dataList=new ArrayList<>();
        //creating first map called apple and adding items into it
        Map<String,Object> apple=new LinkedHashMap<>();
        apple.put("Items","Apple");
        apple.put("Price",20.00);
        apple.put("Quantity",10.0);
        //calculating SubTotal of apples
        double subTotal=(double) apple.get("Price")*(double) apple.get("Quantity");
        //adding SubTotal of apples in Map
        apple.put("SubTotal",subTotal);
        //adding apple Map to dataList
        dataList.add(apple);
        //creating second map called orange and adding items into it
        Map<String,Object> orange=new LinkedHashMap<>();
        orange.put("Items","Orange");
        orange.put("Price",21.99);
        orange.put("Quantity",10.0);
        //calculating SubTotal of oranges
        double subTotal1=(double) orange.get("Price")*(double) orange.get("Quantity");
        //adding SubTotal of oranges in Map
        orange.put("SubTotal",subTotal1);
        //adding orange Map to dataList
        dataList.add(orange);
        //creating loop for dataList
        for (var items:dataList) {
            var Key1=items.get("Items");
            var Key2=items.get("Price");
            var Key3=items.get("Quantity");
            var item=items.entrySet();
            // creating loop tp print all the values
            for (var value:item) {
                System.out.print(value.getKey()+": "+value.getValue()+" ");
            }
            System.out.println();
            System.out.println();
        }
        //calculating sum of subTotal and printing
        var TotalPurchase=subTotal+subTotal1;
        System.out.println("Your Purchase total : "+TotalPurchase);

    }
}
