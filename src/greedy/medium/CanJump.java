package greedy.medium;

public class CanJump {

    public boolean canJump(int[] nums) {

        int maxJump = 0;
        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int curJump = i + nums[i];
            maxJump = Math.max(curJump, maxJump);
            if (maxJump <= i && i != n - 1) {
                return false;
            }
        }

        return true;

    }
}
