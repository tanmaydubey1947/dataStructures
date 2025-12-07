package archive.arrays;

public class ReArrangeArray {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/rearrange-array-elements-by-sign/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * </p>
     *
     * <p>
     * Create two archive.arrays one will store positive numbers and other will store negative numbers. Now iterate through the input array and keep filtering positive and
     * negative numbers and keep putting them into respective archive.arrays. Now either create new array or utilize the input array only, iterate through it again and
     * start filling the numbers back in the array but in alternate fashion. And return the result array.
     * <p>
     * Time Complexity : O(n)
     * </p>
     */


    public static void main(String[] args) {

        int[] result = rearrangeArray(new int[]{3, 1, -2, -5, 2, -4});

        for (int num : result) {
            System.out.println(num);
        }

    }

    public static int[] rearrangeArray(int[] nums) {

        int[] result = new int[nums.length];

        int[] positiveNums = new int[nums.length / 2];
        int[] negativeNums = new int[nums.length / 2];

        int positiveNum = 0;
        int negativeNum = 0;

        for (int num : nums) {
            if (num >= 0) {
                positiveNums[positiveNum] = num;
                positiveNum++;
            } else {
                negativeNums[negativeNum] = num;
                negativeNum++;
            }
        }

        positiveNum = 0;
        negativeNum = 0;

        int temp = 0;
        for (int i = 0; i < result.length; i++) {

            if (temp == 0) {
                result[i] = positiveNums[positiveNum++];
                temp = 1;
            } else {
                result[i] = negativeNums[negativeNum++];
                temp = 0;
            }

        }

        return result;
    }
}
