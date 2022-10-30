package replitTasks;

public class Task120VariablesInJava {
    /*
    Declare 3 instance variables to hold:
    year, school name and batch #
    Access variables from the main method and assign specific values to them
    Print values of your variables in the following format:
     */
        int year;
        String schoolName;
        int batchNo;

    public static void main(String[] args) {
        Task120VariablesInJava values=new Task120VariablesInJava();
        values.year=2021;
        values.schoolName="Syntax";
        values.batchNo=9;
        System.out.println("I am a student of batch "+values.batchNo+" studying at "+values.schoolName+" in the year of "+values.year);

    }
}
