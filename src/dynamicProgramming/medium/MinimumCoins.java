package dynamicProgramming.medium;

import java.util.Arrays;

public class MinimumCoins {

    public int minimumCoins(int[] coins, int amount) {

        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = solve(coins, amount, 0, dp);
        return ans == (int) 1e9 ? -1 : ans;
    }

    private int solve(int[] coins, int amount, int i, int[][] dp) {

        int n = coins.length;

        if (amount < 0) {
            return 0;
        }

        if (i == n - 1) {
            if (amount % coins[i] == 0) {
                return amount / coins[i];
            }
            return (int) 1e9;
        }

        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        int notTake = solve(coins, amount, i + 1, dp);
        int take = (int) 1e9;
        if (amount >= coins[i]) {
            take = 1 + solve(coins, amount - coins[i], i, dp);
        }

        return dp[i][amount] = Math.min(take, notTake);
    }

}
