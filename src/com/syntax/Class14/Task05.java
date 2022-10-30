package com.syntax.Class14;

public class Task05 {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String createEmail(String fName, String lName, String type){

    return (fName+lName+"@"+type+".com").toLowerCase();
    }

    public static void main(String[] args) {
        Task05 email=new Task05();
        String fullemail=email.createEmail("talha","riaz","gmail");
        System.out.println(fullemail);
    }
}
