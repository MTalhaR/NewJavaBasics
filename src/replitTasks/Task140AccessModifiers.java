package replitTasks;

public class Task140AccessModifiers {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.
    Method should visible only within same package!
     */
    static String maxLength(String[] arr){
        String largestString="";
        for (int i=0; i< arr.length; i++){
        if(arr[i].length()>largestString.length()){
            largestString=arr[i];
        }
    }
        return largestString;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
