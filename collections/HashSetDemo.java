package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args){

        // Sets never allow duplicate values
        HashSet<Integer> ids = new HashSet<>();
        ids.add(101);
        ids.add(102);
        ids.add(101);                // ignored, already present

        System.out.println(ids);
        System.out.println(ids.contains(102));

        // TreeSet keeps elements sorted automatically
        TreeSet<Integer> sortedIds = new TreeSet<>(ids);
        sortedIds.add(50);
        System.out.println(sortedIds);
        System.out.println(sortedIds.first()+" "+sortedIds.last());
    }
}

// Practice: Use a HashSet to remove duplicate values from an int[]
// array and print only the unique numbers.
