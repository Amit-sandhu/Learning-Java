package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1;i<=10;i++){
            numbers.add(i);
        }

        // Iterator is the safe way to remove elements while looping
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            int n = it.next();
            if(n % 2 == 0){
                it.remove();
            }
        }

        System.out.println(numbers);
    }
}

// Practice: Use an Iterator to remove every third element from an
// ArrayList<String> of names.
