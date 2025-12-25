package dynamicProgramming.medium;

import java.util.Arrays;


class NinjaTraining {

    // Recursion + Memoization
    public int recursionWithMemoization(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n + 1][4];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(3, matrix, 0, dp);
    }

    private int solve(int last, int[][] matrix, int i, int[][] dp) {

        if (i == matrix.length - 1) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < 3; j++) {

                if (j != last) {
                    max = Math.max(max, matrix[i][j]);
                }
            }

            return max;
        }

        if (dp[i][last] != -1) {
            return dp[i][last];
        }

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < 3; j++) {

            if (j != last) {

                int points = matrix[i][j] + solve(j, matrix, i + 1, dp);
                max = Math.max(points, max);
            }
        }

        return dp[i][last] = max;
    }


    // Tabulation
    public int tabulation(int[][] matrix) {

        int n = matrix.length;
        int[][] dp = new int[n][4];

        dp[0][0] = Math.max(matrix[0][1], matrix[0][2]);
        dp[0][1] = Math.max(matrix[0][2], matrix[0][0]);
        dp[0][2] = Math.max(matrix[0][1], matrix[0][0]);
        dp[0][3] = Math.max(matrix[0][1], Math.max(matrix[0][2], matrix[0][0]));

        for (int day = 1; day < n; day++) {

            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;

                for (int task = 0; task <= 2; task++) {

                    if (last != task) {

                        int activity = matrix[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(activity, dp[day][last]);
                    }
                }
            }
        }

        return dp[n - 1][3];
    }
}

