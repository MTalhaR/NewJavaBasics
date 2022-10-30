package replitTasks;

public class Task139AccessModifiers {
    /*
    Create a method that will be available to all classes in your project with following specifications:
    Returns:    a String
    Name:   alphabetical
    Parameters: a String called str
    Purpose:    Return a string that is composed of each letter as long as the letter is later on in the alphabet
    than its previous one.  You can assume actual parameters are lowercase.
    See below examples.
    Additional Info:
   You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:
    'a' < 'b' ==> True
    'a' < 'a' ==> False
    'a' > 'b' ==> False
    Examples:
    alphabetical("hello") ==> "hlo"
    alphabetical("software") ==> "stwr"
    alphabetical("language") ==> "lnug"
     */
    public String alphabetical(String str){
        String newStr="";
        for (int i=0; i<str.length()-1; i++){
            if (i==0){newStr+=str.charAt(i);}
            if(str.charAt(i+1)>str.charAt(i)){
                newStr+=str.charAt(i+1);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
    Task139AccessModifiers ans=new Task139AccessModifiers();
        System.out.println(ans.alphabetical("hello"));
        System.out.println(ans.alphabetical("software"));
        System.out.println(ans.alphabetical("language"));
    }
}
