package dynamicProgramming.medium;

public class LongestCommonSubstring {

    int maxLen = 0;

    public int recursionAndMemoization(String str1, String str2) {

        int[][] memo = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++)
            for (int j = 0; j <= str2.length(); j++)
                memo[i][j] = -1;

        solve(str1, str2, str1.length(), str2.length(), memo);

        return maxLen;
    }

    private int solve(String s1, String s2, int n, int m, int[][] memo) {

        if (n == 0 || m == 0)
            return 0;

        if (memo[n][m] != -1)
            return memo[n][m];

        int curr = 0;

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            curr = 1 + solve(s1, s2, n - 1, m - 1, memo);
            maxLen = Math.max(maxLen, curr);
        } else {
            curr = 0;
        }

        // Still explore other states
        solve(s1, s2, n - 1, m, memo);
        solve(s1, s2, n, m - 1, memo);

        memo[n][m] = curr;

        return curr;
    }

    public int tabulation(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int ans = 0;

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }

        return ans;
    }

}
