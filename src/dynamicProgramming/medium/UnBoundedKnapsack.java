package dynamicProgramming.medium;

import java.util.Arrays;

public class UnBoundedKnapsack {

    public int unboundedKnapsack(int[] wt, int[] val, int n, int W) {

        int[][] dp = new int[n + 1][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(wt, val, W, 0, dp);
    }

    private int solve(int[] wt, int[] val, int W, int i, int[][] dp) {

        int n = wt.length;

        if (i == n) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        int notTake = solve(wt, val, W, i + 1, dp);
        int take = 0;
        if (W >= wt[i]) {
            take = val[i] + solve(wt, val, W - wt[i], i, dp);
        }

        return dp[i][W] = Math.max(take, notTake);
    }

}
