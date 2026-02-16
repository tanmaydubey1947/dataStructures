package dynamicProgramming.medium;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public int recursionAndMemoization(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return recursionAndMemoization(str1, str2, 0, 0, dp);
    }

    private int recursionAndMemoization(String str1, String str2, int s1, int s2, int[][] dp) {

        int l1 = str1.length();
        int l2 = str2.length();

        if (s1 >= l1 || s2 >= l2) {
            return 0;
        }

        if (dp[s1][s2] != -1) {
            return dp[s1][s2];
        }

        int ans = 0;

        if (str1.charAt(s1) == str2.charAt(s2)) {
            ans = 1 + recursionAndMemoization(str1, str2, s1 + 1, s2 + 1, dp);
        } else {
            int takeS1 = recursionAndMemoization(str1, str2, s1 + 1, s2, dp);
            int takeS2 = recursionAndMemoization(str1, str2, s1, s2 + 1, dp);

            ans = Math.max(takeS1, takeS2);
        }

        return dp[s1][s2] = ans;
    }


    public int tabulation(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }

            }
        }

        return dp[n1][n2];
    }
}
