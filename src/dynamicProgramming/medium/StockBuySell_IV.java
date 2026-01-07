package dynamicProgramming.medium;

import java.util.Arrays;

public class StockBuySell_IV {

    public int stockBuySell(int[] arr, int n, int k) {

        int[][][] dp = new int[n][2][k + 1];
        for (int[][] rows : dp) {
            for (int[] row : rows) {
                Arrays.fill(row, -1);
            }
        }

        return solve(arr, 0, n, k, 0, dp);
    }

    private int solve(int[] arr, int index, int n, int cap, int buy, int[][][] dp) {

        if (cap == 0) {
            return 0;
        }

        if (index == n) {
            return 0;
        }

        if (dp[index][buy][cap] != -1) {
            return dp[index][buy][cap];
        }

        int ans;
        if (buy == 0) {
            int purchase = -arr[index] + solve(arr, index + 1, n, cap, 1, dp);
            int notPurchase = solve(arr, index + 1, n, cap, 0, dp);
            ans = Math.max(purchase, notPurchase);
        } else {
            int sell = arr[index] + solve(arr, index + 1, n, cap - 1, 0, dp);
            int notSell = solve(arr, index + 1, n, cap, 1, dp);
            ans = Math.max(sell, notSell);
        }

        return dp[index][buy][cap] = ans;
    }
}
