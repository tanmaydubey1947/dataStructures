package array.easy;

import java.util.Arrays;

class Solution {
    public int findValueOfPartition(int[] nums) {

        Arrays.sort(nums);
        int minSum = Integer.MAX_VALUE;

        for(int i = 1;i<nums.length;i++) {
            minSum = Math.min(minSum, (nums[i] - nums[i - 1]));
        }

        return minSum;
    }
}
