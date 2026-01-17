package dynamicProgramming.medium;

import java.util.Arrays;

public class SubsetWithMinDifference {

    public int minDifference(int[] arr, int n) {

        int totalSum = 0;
        for (int a : arr) {
            totalSum += a;
        }

        int[][] dp = new int[n][totalSum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i <= totalSum; i++) {
            solve(arr, 0, i, dp);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= totalSum; i++) {
            if (dp[0][i] == 1) {
                ans = Math.min(ans, Math.abs(i - (totalSum - i)));
            }
        }

        return ans;
    }

    private boolean solve(int[] arr, int i, int target, int[][] dp) {

        int n = arr.length;
        if (target == 0) {
            return true;
        }

        if (i == n) {
            return false;
        }

        if (dp[i][target] != -1) {
            return dp[i][target] == 1;
        }

        boolean notTake = solve(arr, i + 1, target, dp);
        boolean take = false;
        if (target >= arr[i]) {
            take = solve(arr, i + 1, target - arr[i], dp);
        }

        dp[i][target] = take || notTake ? 1 : 0;
        return take || notTake;
    }

}
