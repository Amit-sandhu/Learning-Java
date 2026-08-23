package recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(factorialTailRecursive(5, 1));
    }

    // basic recursion: each call breaks the problem into a smaller one
    static long factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    // tail recursion: the recursive call is the last operation,
    // carrying the running result forward in an accumulator
    static long factorialTailRecursive(int n, long accumulator){
        if(n == 0 || n == 1){
            return accumulator;
        }
        return factorialTailRecursive(n-1, n*accumulator);
    }
}

// Practice: Write a recursive method power(int base, int exp) that
// computes base raised to exp without using Math.pow().
