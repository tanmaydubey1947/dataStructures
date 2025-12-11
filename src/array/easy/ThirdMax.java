package array.easy;

import java.util.Arrays;

public class ThirdMax {

    public int thirdMaxBetter(int[] nums) {
        int n = nums.length;
        if (n <= 2) return Arrays.stream(nums).max().getAsInt();

        Arrays.sort(nums);
        int count = 1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
                if (count == 3) {
                    return nums[i - 1];
                }
            }
        }

        return Arrays.stream(nums).max().getAsInt();
    }

    public int thirdMaxOptimal(int[] nums) {

        long firstMax = Long.MIN_VALUE, secondMax = Long.MIN_VALUE, thirdMax = Long.MIN_VALUE;

        for (int num : nums) {

            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != firstMax && num != secondMax) {
                thirdMax = num;
            }
        }

        return (thirdMax == Long.MIN_VALUE) ? (int)firstMax : (int)thirdMax;

    }
}
