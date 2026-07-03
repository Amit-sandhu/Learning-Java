import java.util.Arrays;

public class arrays {
    // same as C more or less
    public static void main(String[] args){
        String[] fruits = {"banana","apple","pineapple","orange"};
        System.out.println(fruits); // return default string representation of the array object
        System.out.println(Arrays.toString(fruits)); // to print an array
        System.out.println(fruits.length);
        System.out.println(fruits[1]);
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
    }
}
