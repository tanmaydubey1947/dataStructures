package dynamicProgramming.medium;

import java.util.Arrays;

public class StockBuySell_II {

    //Recursion + Memoization
    public int stockBuySell(int[] arr, int n) {
        int[][] dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(arr, 0, 0, dp);
    }

    private int solve(int[] arr, int i, int purchased, int[][] dp) {

        if (i == arr.length) {
            return 0;
        }

        if (dp[i][purchased] != -1) {
            return dp[i][purchased];
        }

        int profit;

        if (purchased != 0) {
            int sell = arr[i] + solve(arr, i + 1, 0, dp);
            int notSell = solve(arr, i + 1, 1, dp);
            profit = Math.max(sell, notSell);
        } else {
            int buy = -arr[i] + solve(arr, i + 1, 1, dp);
            int notBuy = solve(arr, i + 1, 0, dp);
            profit = Math.max(buy, notBuy);
        }

        return dp[i][purchased] = profit;
    }
}
