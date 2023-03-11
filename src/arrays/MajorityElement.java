package arrays;

public class MajorityElement {
     /**
     *
     * Leetcode Link : <a href="https://leetcode.com/problems/majority-element/">...</a>
     * <p>
     * Iteration for better approach : 1
     * <p>
     * Approach: 1
     * <p>
     *     Sort the array and then select the first element until the next value is encountered and then keep increasing
     *     the count of that element. Now once the next element is encountered check if the count is greater that n/2.
     *     If the count is greater than n/2 return the number else check for other numbers using same approach.
     *     Time Complexity : O(n^2)
     * <p>
     *
     */

     public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{-1, 1, 1, 1, 2, 1}));

    }

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int count = 1, i;

        for (i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                count++;
            } else if (count > nums.length / 2) {
                return nums[i - 1];
            } else {
                count = 1;
            }
        }
        return nums[i];
    }

}
