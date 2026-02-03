package dynamicProgramming.medium;

class UniquePathWithObstacles {
    public int recursionWithMemoization(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n + 1][m + 1];

        return solve(n, m, matrix, dp, 0, 0);
    }

    private int solve(int n, int m, int[][] matrix, int[][] dp, int i, int j) {

        if (i >= n || j >= m || matrix[i][j] == 1) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int right = solve(n, m, matrix, dp, i, j + 1);
        int down = solve(n, m, matrix, dp, i + 1, j);

        return dp[i][j] = right + down;
    }

    // Tabulation
    public int uniquePathsWithObstacles(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        if (matrix[0][0] == 1 || matrix[n - 1][m - 1] == 1) {
            return 0;
        }
        int[][] dp = new int[n][m];

        dp[n - 1][m - 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    continue;
                } else {

                    if (matrix[i][j] == 1) {
                        dp[i][j] = 0;
                        continue;
                    }

                    int up = 0, left = 0;

                    if (i + 1 <= n - 1) {
                        up = dp[i + 1][j];
                    }

                    if (j + 1 <= m - 1) {
                        left = dp[i][j + 1];
                    }

                    dp[i][j] = up + left;
                }
            }
        }

        return dp[0][0];
    }
}

