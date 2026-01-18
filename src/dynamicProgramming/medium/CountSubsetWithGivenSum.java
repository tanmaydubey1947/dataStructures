package dynamicProgramming.medium;

import java.util.Arrays;

public class CountSubsetWithGivenSum {

    private final int MOD = (int) 1e9 + 7;

    public int perfectSum(int[] arr, int K) {

        int n = arr.length;
        int[][] dp = new int[n][K + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(arr, 0, K, dp);
    }

    private int solve(int[] arr, int i, int K, int[][] dp) {

        int n = arr.length;

        if (K == 0) {
            return 1;
        }

        if (i == n) {
            return 0;
        }

        if (dp[i][K] != -1) {
            return dp[i][K];
        }

        int notTake = solve(arr, i + 1, K, dp);
        int take = 0;
        if (K >= arr[i]) {
            take = solve(arr, i + 1, K - arr[i], dp);
        }

        return dp[i][K] = (take + notTake) % MOD;
    }
}
