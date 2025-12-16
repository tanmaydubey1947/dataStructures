package dynamicProgramming.medium;

import java.util.Arrays;

public class HouseRobber {

    //Recursion + Memoization

    public int houseRobberMemoization(int[] money) {

        int n = money.length;
        if (n == 1) {
            return money[0];
        }

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = money[i];
        }

        for (int i = 1; i < n; i++) {
            arr2[i - 1] = money[i];
        }

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int first = houseRobberMemoization(arr1, 0, n - 1, dp1);
        int second = houseRobberMemoization(arr2, 0, n - 1, dp2);

        return Math.max(first, second);
    }

    private int houseRobberMemoization(int[] money, int i, int n, int[] dp) {

        if (i > n - 1) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int take = money[i] + houseRobberMemoization(money, i + 2, n, dp);
        int notTake = 0 + houseRobberMemoization(money, i + 1, n, dp);

        return dp[i] = Math.max(take, notTake);
    }


    //Tabulation

    public int houseRobberTabulation(int[] money) {

        int n = money.length;
        if (n == 1) {
            return money[0];
        }

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = money[i];
        }

        for (int i = 1; i < n; i++) {
            arr2[i - 1] = money[i];
        }

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        int first = houseRobberTabulation(dp1, arr1);
        int second = houseRobberTabulation(dp2, arr2);

        return Math.max(first, second);
    }


    private int houseRobberTabulation(int[] dp, int[] money) {

        int n = money.length;
        dp[0] = money[0];

        for (int i = 1; i < n; i++) {

            int take = money[i];
            if (i - 2 >= 0) {
                take += dp[i - 2];
            }

            int notTake = 0 + dp[i - 1];
            dp[i] = Math.max(take, notTake);
        }

        return dp[n - 1];

    }


    //Space Optimization

    public int houseRobberSpaceOptimization(int[] money) {

        int n = money.length;
        if (n == 1) {
            return money[0];
        }

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = money[i];
        }

        for (int i = 1; i < n; i++) {
            arr2[i - 1] = money[i];
        }


        int first = solve(arr1);
        int second = solve(arr2);

        return Math.max(first, second);
    }


    private int solve(int[] money) {

        int n = money.length;
        int prev = money[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {

            int take = money[i];
            if (i - 2 >= 0) {
                take += prev2;
            }

            int notTake = 0 + prev;

            prev2 = prev;
            prev = Math.max(take, notTake);
        }

        return prev;

    }
}
