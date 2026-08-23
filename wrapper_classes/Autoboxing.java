package wrapper_classes;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args){

        // autoboxing: primitive int automatically wrapped into an Integer object
        Integer boxed = 10;

        // unboxing: Integer automatically converted back to a primitive int
        int unboxed = boxed;

        System.out.println(boxed+unboxed);

        // this is why collections like ArrayList (which only store objects)
        // can still appear to hold primitives directly
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        int first = numbers.get(0);
        System.out.println(first);

        // caution: comparing boxed values with == can be unreliable
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);          // true, small values are cached

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);          // false, outside the cached range
        System.out.println(c.equals(d));     // true, always compare wrapper objects with equals()
    }
}

// Practice: Write a method sumList(ArrayList<Integer> list) that adds
// up all the values, relying on autoboxing/unboxing throughout.
