package ReplInterview;

import java.util.ArrayList;
import java.util.List;

/*
    Count how many times a given word from a list is present as prefix in another list both lists will be given as input to the function
    You have to implment a method that takes two lists as input one list contains the query words that we want to search from the other list.
    Word List  ["steve","stevens","danny","steves","dan","john","johny"
            ,"joe"
            ,"alex"
            ,"alexander"]
    Query Word List ["steve","alex","joe","john","dan"]
    output
    [2, 1, 0, 1, 1]
    As word steve is present as prefix in word stevens and steves so we get 2 for it note we are not counting if we have the exact word in the
    original list
    word alex is prefix in alexander so we get 1
    word joe is not present as prefix so we get 0
     */
public class R219CountOnlyPrefixes {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("steve");
        arr.add("stevens");
        arr.add("danny");
        arr.add("steves");
        arr.add("dan");
        arr.add("john");
        arr.add("johny");
        arr.add("joe");
        arr.add("alex");
        arr.add("alexander");

        List<String> test = new ArrayList<>();
        test.add("steve");
        test.add("alex");
        test.add("joe");
        test.add("dan");
        test.add("john");

        System.out.println(countOnlyPrefixes(arr, test));
    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {

        List<Integer> prefixes=new ArrayList<>();
        for (int i=0;i<query.size();i++){
            int count=0;
            for (int h=0;h<names.size();h++){
                if(names.get(h).startsWith(query.get(i))&& !names.get(h).equalsIgnoreCase(query.get(i))){
                    count++;
                }
            }
            prefixes.add(count);
        }
        return prefixes;

    }

}
