package com.syntax.class21;

public class CreditCard {
     /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    double balance;
    double interest;

    double displayInterest(double balance){
       interest=balance*0.03;
        System.out.println(interest);
        return interest;
    }

}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    double displayInterest(double balance){
      interest=(balance*0.05);
        System.out.println(interest);
        return interest;
    }

}
class testCreditcard{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.displayInterest(100.5);

        Visa visa=new Visa();
        visa.displayInterest(100.10);

        AX ax=new AX();
        ax.displayInterest(100.5);

    }
}
