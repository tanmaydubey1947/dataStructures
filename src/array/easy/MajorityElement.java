package array.easy;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int freq = 0;
        int num = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (freq == 0) {
                num = nums[i];
                freq++;
            } else if (nums[i] == num) {
                freq++;
            } else {
                freq--;
            }
        }

        return num;
    }
}
