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
}

