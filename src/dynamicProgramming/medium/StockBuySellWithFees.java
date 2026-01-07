package dynamicProgramming.medium;

import java.util.Arrays;

public class StockBuySellWithFees {

    public int stockBuySell(int[] arr, int n, int fee) {

        int[][] dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(arr, 0, fee, 0, dp);
    }

    private int solve(int[] arr, int i, int fee, int buy, int[][] dp) {

        int n = arr.length;

        if (i == n) {
            return 0;
        }

        if (dp[i][buy] != -1) {
            return dp[i][buy];
        }

        int ans;

        if (buy == 0) {
            int purchase = -arr[i] - fee + solve(arr, i + 1, fee, 1, dp);
            int notPurchase = solve(arr, i + 1, fee, 0, dp);
            ans = Math.max(purchase, notPurchase);
        } else {
            int sell = arr[i] + solve(arr, i + 1, fee, 0, dp);
            int notSell = solve(arr, i + 1, fee, 1, dp);
            ans = Math.max(sell, notSell);
        }

        return dp[i][buy] = ans;
    }
}
