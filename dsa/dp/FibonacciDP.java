package dp;

public class FibonacciDP {
    public static void main(String[] args){
        System.out.println(fibTopDown(10, new long[11]));
        System.out.println(fibBottomUp(10));
    }

    // top-down: recursion + memoization (cache results as you go)
    static long fibTopDown(int n, long[] memo){
        if(n <= 1) return n;
        if(memo[n] != 0) return memo[n];
        memo[n] = fibTopDown(n-1, memo) + fibTopDown(n-2, memo);
        return memo[n];
    }

    // bottom-up: build the answer iteratively from the base cases up,
    // avoiding recursion call-stack overhead entirely
    static long fibBottomUp(int n){
        if(n <= 1) return n;
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

// Practice: Reduce fibBottomUp() to only use two variables instead of
// a full dp array, since each step only needs the previous two values.
