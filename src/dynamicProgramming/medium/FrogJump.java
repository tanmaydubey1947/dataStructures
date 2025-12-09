package dynamicProgramming.medium;

import java.util.Arrays;

public class FrogJump {


    //Recursive + Memoization
    public int frogJumpRecursive(int[] heights) {

        int n = heights.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return frogJumpRecursive(0, heights, dp);
    }

    private int frogJumpRecursive(int i, int[] heights, int[] dp) {

        if (i >= heights.length - 1) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int jumpOne = Integer.MAX_VALUE;

        if (i + 1 < heights.length) {
            jumpOne = frogJumpRecursive(i + 1, heights, dp) + Math.abs(heights[i] - heights[i + 1]);
        }

        int jumpTwo = Integer.MAX_VALUE;

        if (i + 2 < heights.length) {
            jumpTwo = frogJumpRecursive(i + 2, heights, dp) + Math.abs(heights[i] - heights[i + 2]);
        }

        return dp[i] = Math.min(jumpOne, jumpTwo);
    }

    //Tabulation


}
