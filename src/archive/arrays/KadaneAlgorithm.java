package archive.arrays;

public class KadaneAlgorithm {
    /**
     *
     * Leetcode Link : <a href="https://leetcode.com/problems/maximum-subarray/">...</a>
     * <p>
     * Iteration for better approach : 1
     * <p>
     * Approach: 1
     * <p>
     *     Take two variables one will store the sum and one will store the maxSum. Now iterate through array and add
     *     elements one by one and in every iteration check if maxSum is less than the sum, if it is less than simply
     *     make maxSum equals to sum. And in every iteration keep checking if the sum is not less than zero, if it is
     *     becoming negative then make it zero. Keep it until last element and simply return the maxSum.
     * <p>
     *
     */

    public static void main(String[] args) {

        System.out.println(kadaneAlgorithm(new int[]{5,4,-1,7,8}));

    }

    public static int kadaneAlgorithm(int[] nums) {

        int sum = 0, maxSum  = Integer.MIN_VALUE;

        for (int num : nums) {
            sum = sum + num;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

       return Math.max(maxSum, sum);
    }

}
