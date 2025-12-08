package dynamicProgramming.easy;

import java.util.Arrays;

public class ClimbingStairs {

    //Recursive

    public int climbStairsRecursive(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbStairsRecursive(n, dp);
    }

    public int climbStairsRecursive(int n, int[] dp) {

        if(n <= 1) {
            return 1;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        int oneStep = climbStairsRecursive(n - 1, dp);
        int twoSteps = climbStairsRecursive(n - 2, dp);
        return dp[n] = oneStep + twoSteps;
    }



    // Iterative / Tabulation

    public int climbStairsIterative(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2;i<=n;i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }




    // Iterative with space optimization

    public int climbStairsIterativeSpaceOptimization(int n) {

        if(n <= 1) {
            return 1;
        }

        int a = 1, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
