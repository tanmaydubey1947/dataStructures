package greedy.medium;

public class JumpGameII {

    public int jump(int[] nums) {

        int currentEnd = 0;
        int farthest = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            farthest = Math.max(farthest, nums[i] + i);

            if (currentEnd == i) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
