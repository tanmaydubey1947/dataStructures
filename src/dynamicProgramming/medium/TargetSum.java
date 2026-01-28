package dynamicProgramming.medium;

import java.util.Arrays;

public class TargetSum {

    private final int MOD = (int) 1e9 + 7;

    public int targetSum(int n, int target, int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum - target < 0) {
            return 0;
        }

        if ((sum - target) % 2 == 1) {
            return 0;
        }

        int s2 = (sum - target) / 2;

        int[][] dp = new int[n + 1][s2 + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, 0, s2, dp);
    }

    private int solve(int[] nums, int i, int target, int[][] dp) {

        int n = nums.length;

        if (i == n) {
            return target == 0 ? 1 : 0;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int notTake = solve(nums, i + 1, target, dp);
        int take = 0;
        if (target >= nums[i]) {
            take = solve(nums, i + 1, target - nums[i], dp);
        }

        return dp[i][target] = (take + notTake) % MOD;
    }
}
