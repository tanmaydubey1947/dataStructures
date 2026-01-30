package dynamicProgramming.medium;

import java.util.Arrays;

public class RodCutting {

    public int RodCutting(int[] price, int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(price, n, 0, dp);
    }

    private int solve(int[] price, int n, int i, int[][] dp) {

        int len = price.length;
        if (i == len || n <= 0) {
            return 0;
        }

        if (dp[i][n] != -1) {
            return dp[i][n];
        }

        int notCut = solve(price, n, i + 1, dp);
        int cut = -1;
        if (n >= i + 1) {
            cut = price[i] + solve(price, n - (i + 1), i, dp);
        }

        return dp[i][n] = Math.max(cut, notCut);
    }
}
