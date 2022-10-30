package com.syntax.class17;

public class HW3Test {
    public static void main(String[] args) {
            HW3 p1=new HW3("Talha", 25,"lenovo");   //public
            //HW3 p2=new HW3("Talha", 25);    //private
            HW3 p3=new HW3("Talha");    //protected
            HW3 p4=new HW3();   //default
            p1.answers();
            //p2.answers();
            p3.answers();
            p4.answers();
    }
}
