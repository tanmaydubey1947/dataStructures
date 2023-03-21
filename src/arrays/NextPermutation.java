package arrays;

public class NextPermutation {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/next-permutation/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * </p>
     *      Start traversing the array from the right most end and check if the array is sorted in descending order, if so then simply reverse the array and return it.
     *      Else if we encounter the element (say at index = i) such that it's next element is smaller than previous from right end then, keep that element in a variable and again traverse
     *      the array from end checking the first greater number to it. Swap the two numbers and reverse the array from the i+1 where we have encountered the descending order break.
     * <p>
     *
     * <p>
     * Time Complexity : O(n^2)
     * </p>
     */

    public static void main(String[] args) {

        nextPermutation(new int[]{4, 2, 0, 2, 3, 2, 0});

    }

    public static void nextPermutation(int[] nums) {

        int check = 0;

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int temp = nums[i - 1];
                int j = nums.length - 1;
                while (temp >= nums[j]) {
                    j--;
                }

                nums[i - 1] = nums[j];
                nums[j] = temp;

                int lastIndex = nums.length - 1;

                for (int k = i; k <= (nums.length - 1 + i) / 2; k++) {
                    int x = nums[k];
                    nums[k] = nums[lastIndex];
                    nums[lastIndex] = x;
                    lastIndex--;
                }
                check = 1;
                break;
            }
        }

        if (check != 1) {
            int lastIndex = nums.length - 1;
            for (int i = 0; i < nums.length / 2; i++) {
                int x = nums[i];
                nums[i] = nums[lastIndex];
                nums[lastIndex] = x;
                lastIndex--;
            }
        }

    }
}
