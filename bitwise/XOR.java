package bitwise;

public class XOR {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        System.out.println(a ^ b);

        // XOR sets a bit to 1 only if the two bits are different
        // it is commonly used to find the single non-repeating element
        // in an array where every other element repeats twice
    }
}

// Practice: Given an array where every element appears twice except one,
// find that single element using XOR.
