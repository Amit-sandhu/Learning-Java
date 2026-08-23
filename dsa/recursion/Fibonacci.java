package recursion;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args){
        for(int i = 0;i<10;i++){
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();

        HashMap<Integer, Long> memo = new HashMap<>();
        System.out.println(fibonacciMemo(40, memo));
    }

    // plain recursion recomputes the same values many times,
    // making it exponential time for larger n
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // memoization stores already-computed results, turning it into
    // linear time instead of exponential
    static long fibonacciMemo(int n, HashMap<Integer, Long> memo){
        if(n <= 1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        long result = fibonacciMemo(n-1, memo) + fibonacciMemo(n-2, memo);
        memo.put(n, result);
        return result;
    }
}

// Practice: Rewrite fibonacciMemo() as an iterative loop using only
// two variables to track the previous two values (no recursion, no memo map).
