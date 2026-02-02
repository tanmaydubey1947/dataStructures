package dynamicProgramming.medium;

import java.util.Arrays;


class GridUniquePaths {

    // Recursion + Memoization
    public int recursionAndMemoization(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(m, n, 0, 0, dp);
    }

    private int solve(int m, int n, int i, int j, int[][] dp) {

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (i > m - 1 || j > n - 1) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = solve(m, n, i, j + 1, dp);
        int bottom = solve(m, n, i + 1, j, dp);

        return dp[i][j] = right + bottom;
    }

    // Tabulation

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = 1;
        int ans = 0;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (i == m - 1 && j == n - 1) {
                    continue;
                } else {

                    int right = 0;
                    int down = 0;
                    if (i + 1 <= m - 1) {
                        right = dp[i + 1][j];
                    }

                    if (j + 1 <= n - 1) {
                        down = dp[i][j + 1];
                    }

                    dp[i][j] = Math.max(ans, right + down);
                }
            }
        }

        return dp[0][0];
    }
}



