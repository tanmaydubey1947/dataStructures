package dynamicProgramming.medium;

import java.util.Arrays;

public class CoinChangeII {

    int MOD = (int) 1e9 + 7;

    public int count(int[] coins, int N, int amount) {
        int[][] dp = new int[N + 1][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(coins, 0, amount, dp);
    }

    private int solve(int[] coins, int i, int amount, int[][] dp) {

        int n = coins.length;

        if (i == n) {
            return amount == 0 ? 1 : 0;
        }

        if (amount < 0) {
            return 0;
        }

        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        int notTake = solve(coins, i + 1, amount, dp);
        int take = 0;
        if (amount >= coins[i]) {
            take = solve(coins, i, amount - coins[i], dp);
        }

        return dp[i][amount] = (take + notTake) % MOD;
    }

}
