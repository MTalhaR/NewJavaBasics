package ReplInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    /*
    Count the number of repetations of words in an ArrayList append that count and return that list.
    You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
    input ["switch","tv","switch","tv","switch","tv"]
    output [switch, tv, switch1, tv1, switch2, tv2]
    In this example as word switch is repeated we pick the next entry
    where it is repeated and append the count i.e how many times that
    word was present previously
    More Exmaples
    input ["switch","tv","switch","tv","switch","tv","radio"]
    output [switch, tv, switch1, tv1, switch2, tv2, radio]
    input ["switch","tv","switch","tv"]
    output [switch, tv, switch1, tv1]
    if words are not repeated we get the same output
    input ["switch","tv"]
    output [switch, tv]
     */
public class R218CountWithWords {
        public static void main(String[] args) {
            List<String> words = new ArrayList<>();
            words.add("switch");
            words.add("tv");
            words.add("switch");
            words.add("tv");
            words.add("switch");
            words.add("tv");
            words.add("radio");
            System.out.println(words);
            System.out.println(countDeviceNames(words));
        }
        public static List<String> countDeviceNames(List<String> deviceNames) {
            for (int i = 0; i < deviceNames.size(); i++) {
                int number=1;
                for (int j = i + 1; j < deviceNames.size(); j++) {
                    if (deviceNames.get(i) == deviceNames.get(j)) {
                        deviceNames.set(j,deviceNames.get(j)+(number));
                        number++;
                    }
                }
            }
            return deviceNames;
        }
}
