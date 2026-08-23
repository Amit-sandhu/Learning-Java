package dp;

public class ClimbingStairs {
    public static void main(String[] args){
        System.out.println(countWays(5));
    }

    // you can climb 1 or 2 steps at a time - how many distinct ways
    // are there to reach the top of n stairs? this is really just
    // the Fibonacci sequence in disguise
    static int countWays(int n){
        if(n <= 2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

// Practice: Extend countWays() to allow climbing 1, 2, or 3 steps
// at a time instead of just 1 or 2.
