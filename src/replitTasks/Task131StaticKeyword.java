package replitTasks;

public class Task131StaticKeyword {
    /*
    Write a method header on line two with the following specs:
    Returns:    a String
    Name:    thirdLetter
    Parameters:    a String called s
    Then complete the method by programming the following behavior
    Returns every 3rd letter of the String s,     starting from the first letter.
    Examples:
    thirdLetter("hello there") ==> "hltr"
    thirdLetter("technology") ==> "thly"
     */
    static String thirdLetter(String s){
        String str = "";
        for (int i=0; i<s.length(); i+=3){
            str=str+s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
