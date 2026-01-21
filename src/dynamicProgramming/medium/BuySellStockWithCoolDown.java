package dynamicProgramming.medium;

import java.util.Arrays;

public class BuySellStockWithCoolDown {

    public int maxProfit(int[] prices) {

        int[][][] dp = new int[prices.length][2][2];
        for (int[][] rows : dp) {
            for (int[] row : rows) {
                Arrays.fill(row, -1);
            }
        }
        return solve(prices, 0, 0, dp, 0);
    }

    private int solve(int[] prices, int i, int buy, int[][][] dp, int allowed) {

        int n = prices.length;

        if (i == n) {
            return 0;
        }

        if (dp[i][buy][allowed] != -1) {
            return dp[i][buy][allowed];
        }

        if (allowed == 0) {
            int ans;
            if (buy == 0) {
                int purchase = -prices[i] + solve(prices, i + 1, 1, dp, 0);
                int notPurchase = solve(prices, i + 1, 0, dp, 0);
                ans = Math.max(purchase, notPurchase);
            } else {
                int sell = prices[i] + solve(prices, i + 1, 0, dp, 1);
                int notSell = solve(prices, i + 1, 1, dp, 0);
                ans = Math.max(sell, notSell);
            }
            return dp[i][buy][allowed] = ans;
        } else {
            return solve(prices, i + 1, 0, dp, 0);
        }
    }
}
