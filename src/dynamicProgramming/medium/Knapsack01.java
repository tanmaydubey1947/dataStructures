package dynamicProgramming.medium;

import java.util.Arrays;

public class Knapsack01 {

    public int knapsack01(int[] wt, int[] val, int n, int W) {
        int[][] dp = new int[n][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(wt, val, 0, W, dp);
    }

    private int solve(int[] wt, int[] val, int i, int W, int[][] dp) {

        int n = wt.length;

        if (i == n) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        int notTake = solve(wt, val, i + 1, W, dp);

        int take = 0;
        if (W >= wt[i]) {
            take = val[i] + solve(wt, val, i + 1, W - wt[i], dp);
        }

        return dp[i][W] = Math.max(take, notTake);
    }
}
