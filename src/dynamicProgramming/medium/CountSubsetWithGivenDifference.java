package dynamicProgramming.medium;

import java.util.Arrays;

public class CountSubsetWithGivenDifference {

    public int countPartitions(int n, int diff, int[] arr) {

        int sum = 0;
        for (int a : arr) {
            sum += a;
        }

        if (diff > sum || (sum + diff) % 2 != 0) {
            return 0;
        }

        int target = (sum + diff) / 2;

        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(arr, target, 0, dp);
    }

    private int solve(int[] arr, int target, int i, int[][] dp) {

        if (i == arr.length) {
            return target == 0 ? 1 : 0;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int notTake = solve(arr, target, i + 1, dp);
        int take = 0;
        if (target >= arr[i]) {
            take = solve(arr, target - arr[i], i + 1, dp);
        }

        return dp[i][target] = (take + notTake) % 1000000007;
    }
}
