package com.syntax.class17;

public class HW3 {
    /*
            Write a java class that have 4 constructors with 4 different access levels of constructors
            (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
            2 - from outside the class; 3 - from different class inside different package  and observe result.
             */
    private String name;
    private int age;
    private String laptop;

    public HW3(String name, int age, String laptop) {
        this.name = name;
        this.age = age;
        this.laptop=laptop;
    }

    private HW3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected HW3(String name) {

        this.name = name;
    }
    HW3() {
    }
    public void answers(){
        System.out.println(name+" "+age+" "+laptop);
    }
    public static void main(String[] args) {
        new HW3("Talha", 25,"lenovo").answers(); //public
        new HW3("Talha", 25).answers();    //private
        new HW3("Talha").answers();    //protected
        new HW3().answers();// default

    }
}
