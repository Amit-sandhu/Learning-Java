package arrays;
import java.util.Arrays;

class Car {
    // test class
}

public class arrays2 {

    int[] arr1 = new int[5];
    int arr2[] = new int[5]; // both are the same just different notations to declare the array (all are correct)
    int[] arr3 = new int[5];

    int[] arr4, arr5; // both are int array
    int arr6[], arr7; // arr6 is an int array but not arr7

    /*
     * int[] is the class -> int array,
     * arr is the name of refrence
     * new is used to create a new object
     * int[5] declares the size of the new array made (5 in this case)
     */

    // DEFAULT values assigned to differnt datatype arrays after declaration

    public static void main(String[] args) {

        int[] array = new int[5];
        double[] array1 = new double[5];
        boolean[] array2 = new boolean[5];
        char[] array3 = new char[5];
        Car[] array4 = new Car[5];
        String[] array5 = new String[5];

        System.out.println(Arrays.toString(array));     // 0 to all
        System.out.println(Arrays.toString(array1));    // 0.0 to all
        System.out.println(Arrays.toString(array2));    // false to all
        System.out.println(Arrays.toString(array3));    // ' ' to all
        System.out.println(Arrays.toString(array4));    // null to all (null in case of classes)
        System.out.println(Arrays.toString(array5));    // null to all as String is also a derived class
        System.out.println((array4[0]));

    }
}
