package replitTasks;

public class Task119JavaMethods {
    /*
    Write a method header with the following specs:
    Returns:
    a String
    Name:
    censorLetter
    Parameters:
    a String
    a char
    Then complete the method by programming the following behavior
    Replace all instances of given character with a "*" within the given String.
    See below examples.
    Examples:
    censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
    String censorLetter(String str, char letter){
        return str.replaceAll(str.valueOf(letter),"*");
    }
    public static void main(String[] args) {
        Task119JavaMethods newstr=new Task119JavaMethods();
        String newstr1= newstr.censorLetter("computer science", 'e');
        String newstr2=newstr.censorLetter("trick or treat",'t');
        System.out.println(newstr1);
        System.out.println(newstr2);
    }
}
