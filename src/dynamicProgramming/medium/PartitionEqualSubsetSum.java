package dynamicProgramming.medium;

import java.util.Arrays;

public class PartitionEqualSubsetSum {

    public boolean equalPartition(int n, int[] arr) {

        int sum = 0;
        for (int a : arr) {
            sum += a;
        }

        if (sum % 2 == 1) {
            return false;
        }

        int[][] dp = new int[arr.length][(sum / 2) + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(arr, 0, sum / 2, dp);
    }

    private boolean solve(int[] arr, int i, int target, int[][] dp) {

        if (target == 0) {
            return true;
        }

        if (i >= arr.length) {
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

        dp[i][target] = (take || notTake) ? 1 : 0;

        return take || notTake;
    }

}
