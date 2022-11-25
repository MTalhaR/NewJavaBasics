package ReplInterview;

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

    }



    public static List<String> countDeviceNames(List<String> deviceNames) {



        String[] uniqueNames = new String[deviceNames.size()];

        for (int i = 0; i < deviceNames.size(); i++) {

            String name = deviceNames.get(i);
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {

                if (uniqueNames[j].equals(name)) {
                    duplicate = true;
                    break;
                }

            }

            if (!duplicate) {

                uniqueNames[i] = name;

            } else {


                int id = 1;

                boolean exists = true;


                while (exists) {


                    exists = false;


                    for (int j = 0; j < i; j++) {

                        if (uniqueNames[j].equals(name + id)) {

                            exists = true;

                            id++;


                            break;

                        }

                    }

                }


                uniqueNames[i] = name + id;

            }

        }

        return Arrays.asList(uniqueNames);

    }
}
