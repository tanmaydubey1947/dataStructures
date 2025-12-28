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
}
