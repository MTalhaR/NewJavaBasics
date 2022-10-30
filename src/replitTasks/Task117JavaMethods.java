package replitTasks;

public class Task117JavaMethods {
    /*
    Create a method with the following specs:
    Returns:
    an integer
    Name:
    sumEvenToX
    Parameters:
    an integer called "x"
    Purpose:
    calculate the sum of the EVEN integers from 1 to x (including x)
     */
    int sumEvenTox(int x) {
        int sum=0;
        for (int i = 1; i <= x; i++) {
            if(i%2==0){
          sum+=i;}
        }
        return sum;
    }
    public static void main(String[] args) {
        Task117JavaMethods num=new Task117JavaMethods();
        int values=num.sumEvenTox(8);
        System.out.println(values);
    }
}
