package dynamicProgramming.medium;

import java.util.Arrays;

public class FrogJumpKDistance {

    //Memoization + Recursion

    public int frogJumpMemoization(int[] heights, int k) {
        int[] dp = new int[heights.length];
        Arrays.fill(dp, -1);
        return frogJumpMemoization(heights, k, 0, dp);
    }

    private int frogJumpMemoization(int[] heights, int k, int i, int[] dp) {

        if (i >= heights.length - 1) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int minStep = Integer.MAX_VALUE;

        for (int j = 1; j <= k; j++) {
            if (i + j < heights.length) {
                int cur = frogJumpMemoization(heights, k, j + i, dp) + Math.abs(heights[i] - heights[i + j]);
                minStep = Math.min(cur, minStep);
            }
        }

        return dp[i] = minStep;
    }


    //Tabulation

    public int frogJump(int[] heights, int k) {

        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            int minStep = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {

                if (i - j >= 0) {
                    int cur = dp[i - 1] + Math.abs(heights[i] - heights[i - j]);
                    minStep = Math.min(minStep, cur);
                }
            }

            dp[i] = minStep;
        }

        return dp[n - 1];
    }
}
