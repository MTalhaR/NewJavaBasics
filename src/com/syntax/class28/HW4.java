package com.syntax.class28;

import java.util.TreeMap;

/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object details.
 */
public class HW4 {
    public static void main(String[] args) {
        TreeMap<Integer,Person> person=new TreeMap<>();
        person.put(01,new Person("Talha", "Riaz", 25, 180000));
        person.put(02,new Person("Atika", "Rani", 25, 200000));
        person.put(03,new Person("Fawaz", "Khalid", 22, 150000));
        person.put(04,new Person("Shazil", "Hassan", 26, 300000));
        person.put(05,new Person("Areej", "Zafar", 22, 250000));
        var items=person.keySet();
        for (var item:items) {
            person.get(item).printDetails();
        }
    }
}
class Person{
    String name;
    String lastName;
    int age;
    double salary;
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void printDetails(){
        System.out.println(name+" "+lastName+", age is "+age+" and the salary is "+salary);
    }
}