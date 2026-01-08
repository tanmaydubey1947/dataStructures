package dynamicProgramming.medium;

import java.util.Arrays;

public class SumSubsetEqualsToTarget {

    public boolean isSubsetSum(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(arr, 0, target, dp);
    }

    private boolean solve(int[] arr, int i, int target, int[][] dp) {

        if (target == 0) {
            return true;
        }

        int n = arr.length;

        if (i == n) {
            return false;
        }

        if (dp[i][target] != -1) {
            return dp[i][target] == 1;
        }

        boolean take = false;
        if (target >= arr[i]) {
            take = solve(arr, i + 1, target - arr[i], dp);
        }
        boolean notTake = solve(arr, i + 1, target, dp);

        dp[i][target] = take || notTake ? 1 : 0;

        return take || notTake;
    }

}
