package array.medium;

public class MinimumArrayLength {

    public int minimumArrayLength(int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }

        for (int num : nums) {
            if (num % min != 0) {
                return 1;
            }
        }

        int freq = 0;

        for (int num : nums) {
            if (num == min) {
                freq++;
            }
        }

        return (freq + 1) / 2;
    }
}
