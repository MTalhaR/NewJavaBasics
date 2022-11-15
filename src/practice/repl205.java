package practice;

import java.util.HashMap;

public class repl205 {
    public static void main(String[] args) {
        HashMap<String,String> words=new HashMap<>();
        words.put("Street","Patrick ST");
        words.put("Suite","265");
        words.put("City","Vienna");
        words.put("Zip","22180");
        words.put("Country", "United State");

        var iterator = words.entrySet().iterator();
        while (iterator.hasNext()){
            var value = iterator.next();

            System.out.println(value.getValue().toUpperCase());

        }
    }
}
