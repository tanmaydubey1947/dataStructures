package dynamicProgramming.medium;

import java.util.Arrays;

public class FrogJumpKDistance {

    public int frogJump(int[] heights, int k) {
        int[] dp = new int[heights.length];
        Arrays.fill(dp, -1);
        return helper(heights, k, 0, dp);
    }

    private int helper(int[] heights, int k, int i, int[] dp) {

        if (i >= heights.length - 1) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int minStep = Integer.MAX_VALUE;

        for (int j = 1; j <= k; j++) {
            if (i + j < heights.length) {
                int cur = helper(heights, k, j + i, dp) + Math.abs(heights[i] - heights[i + j]);
                minStep = Math.min(cur, minStep);
            }
        }

        return dp[i] = minStep;
    }
}
