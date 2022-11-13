package com.syntax.class28;

import java.util.HashMap;

/*
Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class HW5 {
    public static void main(String[] args) {
        HashMap<String,Integer> employee=new HashMap<>();
        employee.put("Talha",150000);
        employee.put("Fawaz",100000);
        employee.put("Atika",165000);
        employee.put("Shazil",180000);
        employee.put("Bodla",200000);
        int a=0;
        String name="";
        //var items=employee.keySet();
        for (var item:employee.entrySet()) {
             if(item.getValue()>a){
                a=item.getValue();
                name=item.getKey();
            }
        }
        System.out.println(name+" = "+a);
    }
}
