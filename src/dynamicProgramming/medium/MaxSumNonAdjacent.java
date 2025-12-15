package dynamicProgramming.medium;

import java.util.Arrays;

public class MaxSumNonAdjacent {

    //Recursive + Memoization

    public int nonAdjacentRecursive(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return nonAdjacentRecursive(0, nums, dp);
    }

    private int nonAdjacentRecursive(int i, int[] nums, int[] dp) {

        if (i >= nums.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int take = nums[i] + nonAdjacentRecursive(i + 2, nums, dp);
        int notTake = 0 + nonAdjacentRecursive(i + 1, nums, dp);

        return dp[i] = Math.max(take, notTake);
    }


    //Tabulation

    public int nonAdjacentTabulation(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {

            int take = nums[i];
            if (i > 1) {
                take += dp[i - 2];
            }

            int notTake = 0 + dp[i - 1];

            dp[i] = Math.max(take, notTake);
        }

        return dp[n - 1];
    }

    //Space Optimization
    public int nonAdjacentSpaceOptimization(int[] nums) {

        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {

            int take = nums[i];
            if (i > 1) {
                take += prev2;
            }

            int notTake = 0 + prev;

            prev2 = prev;
            prev = Math.max(take, notTake);
        }

        return prev;
    }
}
