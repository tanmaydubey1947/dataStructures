package dynamicProgramming.hard;

import java.util.Arrays;

public class CherryPickII {
    public int cherryPickup(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int[][][] dp = new int[n][m][m];

        for (int[][] rows : dp) {
            for (int[] row : rows) {
                Arrays.fill(row, -1);
            }
        }

        return solve(0, 0, m - 1, matrix, dp);
    }

    private int solve(int i, int j1, int j2, int[][] matrix, int[][][] dp) {

        int n = matrix.length;
        int m = matrix[i].length;

        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) {
            return (int) (-1e9);
        }

        if (i == n - 1) {

            if (j1 == j2) {
                return matrix[i][j1];
            } else {
                return matrix[i][j1] + matrix[i][j2];
            }
        }

        if (dp[i][j1][j2] != -1) {
            return dp[i][j1][j2];
        }

        int max = Integer.MIN_VALUE;

        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {

                if (j1 == j2) {
                    int cur = matrix[i][j1] + solve(i + 1, j1 + d1, j2 + d2, matrix, dp);
                    max = Math.max(cur, max);
                } else {
                    int cur = matrix[i][j1] + matrix[i][j2] + solve(i + 1, j1 + d1, j2 + d2, matrix, dp);
                    max = Math.max(max, cur);
                }
            }
        }

        return dp[i][j1][j2] = max;
    }
}

