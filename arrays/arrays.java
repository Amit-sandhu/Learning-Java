package arrays;
import java.util.Arrays;

public class arrays {
    // same as C more or less
    public static void main(String[] args){


        // String[] fruits = {"banana","apple","pineapple","orange"};

        // System.out.println(fruits);                                                 // return default string representation of the array object
        // System.out.println(Arrays.toString(fruits));                                // to print an array

        // System.out.println(fruits.length);
        // System.out.println(fruits[1]);

        // Arrays.sort(fruits);
        // System.out.println(Arrays.toString(fruits));
        
        
        // System.out.println(fruits.getClass().getName() + "@" + fruits.hashCode());
        student();
        // char_array();
        // bool_array();
        
        
    }
    
    static void student(){
        int[] students;           //null
        students = new int[5];
        
        // int[] students = new int[5];   same as above
        
        System.out.println(students);
        System.out.println(Arrays.toString(students));
        
        // System.out.println(students.getClass().getName());
        // System.out.println(students.hashCode());
        
    }
    
    static void char_array(){
        char[] ch = new char[4];
        System.out.println(ch);
        // System.out.println(Arrays.toString(ch));
    }

    static void bool_array(){
        boolean[] bool = new boolean[4];
        System.out.println(bool);
        // System.out.println(Arrays.toString(bool));
    }   
}
