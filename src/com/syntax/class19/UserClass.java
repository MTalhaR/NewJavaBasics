package com.syntax.class19;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String mobileNum;

    public UserClass(String name, String mobileNum) {
        this.name = name;
        this.mobileNum = mobileNum;
    }
}
class userInfo extends UserClass{
    String address;

    public userInfo(String name, String mobileNum, String address) {
        super(name, mobileNum);
        this.address=address;
    }
    void userDetail(){
        System.out.println(name+" number is "+mobileNum+" and he lives in "+address);
    }
}
class testUser{
    public static void main(String[] args) {
        userInfo abc=new userInfo("Talha", "0344-0548100", "Pakistan");
        abc.userDetail();
    }
}