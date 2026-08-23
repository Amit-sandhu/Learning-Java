package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args){

        // ArrayList is a resizable array, unlike int[] which has a fixed size
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add(1,"pear");          // insert at a specific index

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.contains("banana"));

        fruits.remove("apple");
        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);

        for(String f : fruits){
            System.out.println(f);
        }

        System.out.println("Size: "+fruits.size());
    }
}

// Practice: Given an ArrayList<Integer> of scores, remove every score
// below 40 using an Iterator (removing directly in a for-each loop
// throws a ConcurrentModificationException).
