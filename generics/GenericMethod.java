package generics;

public class GenericMethod {
    public static void main(String[] args){
        Integer[] nums = {5,2,8,1,9};
        String[] words = {"pear","apple","mango"};

        printArray(nums);
        printArray(words);

        System.out.println(findMax(nums));
    }

    // <T> before the return type declares this method itself is generic
    static <T> void printArray(T[] arr){
        for(T item : arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }

    // bounded generic: T must implement Comparable so compareTo() is guaranteed to exist
    static <T extends Comparable<T>> T findMax(T[] arr){
        T max = arr[0];
        for(T item : arr){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}

// Practice: Write a generic method findMin(T[] arr) using the same
// bounded type pattern as findMax().
