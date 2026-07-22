package bitwise;

public class Bitwise {
    public static void main(String[] args){

        System.out.println(Integer.toBinaryString(8|12));       // or operator
        System.out.println(Integer.toBinaryString(8&12));       // and operator
        System.out.println(Integer.toBinaryString(5<<3));       // left-shift operator
        
        // left-shift opeartor shifts all the bits to the left by one position and add a 0 
        // at the right end  (it also always doubles the number x2)
        // syntax (x<<y)
        // x is the integer number we want to use the opearator on and y is the number of times
        // we want to shift the number
        
        System.out.println(Integer.toBinaryString(8>>1));       // right-shift operator
        
        // right-shift opeartor shifts all the bits to the right by one position and add a 0 
        // at the right end  (it also always halves the number /2)
        // syntax (x>>y)
        // x is the integer number we want to use the opearator on and y is the number of times
        // we want to shift the number

    }
}
