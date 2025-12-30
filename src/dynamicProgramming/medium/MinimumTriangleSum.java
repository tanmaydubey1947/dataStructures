package dynamicProgramming.medium;

import java.util.Arrays;

public class MinimumTriangleSum {

    public int minTriangleSum(int[][] triangle) {

        int n = triangle.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(triangle, dp, 0, 0);
    }

    private int solve(int[][] triangle, int[][] dp, int i, int j) {

        int n = triangle.length;

        if (i == n - 1) {
            return triangle[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int bottom = triangle[i][j] + solve(triangle, dp, i + 1, j);
        int bottomRight = triangle[i][j] + solve(triangle, dp, i + 1, j + 1);

        return dp[i][j] = Math.min(bottom, bottomRight);
    }
}
