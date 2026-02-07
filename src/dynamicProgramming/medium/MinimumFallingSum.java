package dynamicProgramming.medium;

import java.util.Arrays;

public class MinimumFallingSum {

    //Recursion + Memoization

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < m; j++) {
            ans = Math.min(ans, solve(matrix, 0, j, dp));
        }

        return ans;
    }

    private int solve(int[][] matrix, int i, int j, int[][] dp) {

        int n = matrix.length;
        int m = matrix[0].length;

        if (i >= n || j >= m) {
            return 0;
        }

        if (i == n - 1) {

            int min = matrix[i][j];

            // bottom-left
            if (j - 1 >= 0) {
                min = Math.min(min, matrix[i][j - 1]);
            }

            // bottom-right
            if (j + 1 <= m - 1) {
                min = Math.min(min, matrix[i][j + 1]);
            }

            return min;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // bottom
        int bottom = matrix[i][j] + solve(matrix, i + 1, j, dp);

        // bottom-left
        int bottomLeft = Integer.MAX_VALUE;
        if (j - 1 >= 0) {
            bottomLeft = matrix[i][j - 1] + solve(matrix, i + 1, j - 1, dp);
        }

        // bottom-right
        int bottomRight = Integer.MAX_VALUE;
        if (j + 1 <= m - 1) {
            bottomRight = matrix[i][j + 1] + solve(matrix, i + 1, j + 1, dp);
        }

        return dp[i][j] = Math.min(bottom, Math.min(bottomLeft, bottomRight));
    }

    // Tabulation

    public int minFallingPathSumTabulation(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int down = dp[i - 1][j] + matrix[i][j];
                int left = (int) 1e9;
                int right = (int) 1e9;

                if (i - 1 >= 0 && j - 1 >= 0) {
                    left = matrix[i][j] + dp[i - 1][j - 1];
                }

                if (j + 1 < m && i - 1 >= 0) {
                    right = matrix[i][j] + dp[i - 1][j + 1];
                }

                dp[i][j] = Math.min(down, Math.min(left, right));
            }
        }

        int ans = (int) 1e9;

        for (int j = 0; j < m; j++) {
            ans = Math.min(ans, dp[n - 1][j]);
        }

        return ans == (int) 1e9 ? -1 : ans;
    }
}
