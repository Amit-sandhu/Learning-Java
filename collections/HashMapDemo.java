package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){

        // HashMap stores key -> value pairs with no guaranteed order
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("john", 85);
        marks.put("sara", 92);
        marks.put("mike", 76);

        System.out.println(marks.get("sara"));
        System.out.println(marks.containsKey("john"));

        marks.put("john", 90);          // overwrites the existing value for "john"
        System.out.println(marks);

        marks.remove("mike");

        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey()+" scored "+entry.getValue());
        }

        System.out.println(marks.getOrDefault("unknown", 0));
    }
}

// Practice: Count how many times each word appears in a String[] array
// of words using a HashMap<String, Integer>.
