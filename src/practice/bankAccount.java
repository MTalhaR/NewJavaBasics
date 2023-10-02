package practice;
//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
// account balance falls below one hundred.
public class bankAccount {
    int RemainingBalance = 1000;
    public void deposit(int newAmount){
        RemainingBalance += newAmount;
        System.out.println(RemainingBalance);
    }
    public void withdraw(int withdrawAmount){
        RemainingBalance -= withdrawAmount;
        System.out.println(RemainingBalance);
    }
}

class savingAccounts extends bankAccount{
    @Override
    public void withdraw(int amount){
    if (super.RemainingBalance-amount<100){
        System.out.println("balance is less than 100");
    } else {
        int newValue = super.RemainingBalance-amount;
        System.out.println("remaining balance is : "+ newValue);
    }
    }

    public static void main(String[] args) {
        savingAccounts obj = new savingAccounts();
        obj.withdraw(950);
    }


}
