package dynamicProgramming.medium;


class FrogJumpLeetcode {
    public boolean canCross(int[] stones) {
        if(stones[1] != 1) {
            return false;
        }
        Boolean[][] dp = new Boolean[stones.length][stones.length + 1];
        return solve(stones, 1, 1, dp);
    }


    private boolean solve(int[] stones, int lastJump, int i, Boolean[][] dp) {

        if(i == stones.length - 1) {
            return true;
        }

        if(lastJump <= 0) {
            return false;
        }

        if(dp[i][lastJump] != null) {
            return dp[i][lastJump];
        }

        boolean lessJump = false;
        boolean moreJump = false;
        boolean sameJump = false;

        int jump = search(stones, stones[i] + lastJump - 1);
        if(jump != -1) {
            lessJump = solve(stones, lastJump - 1, jump, dp);
        }

        jump = search(stones, stones[i] + lastJump);
        if(jump != -1) {
            sameJump = solve(stones, lastJump, jump, dp);
        }

        jump = search(stones, stones[i] + lastJump + 1);
        if(jump != -1) {
            moreJump = solve(stones, lastJump + 1, jump, dp);
        }

        return dp[i][lastJump] = lessJump || moreJump || sameJump;
    }

    private int search(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}