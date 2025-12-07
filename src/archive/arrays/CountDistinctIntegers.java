package archive.arrays;

import java.util.*;

public class CountDistinctIntegers {


    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * <p>
     *     Create a new array of double size of initial array, and then copy all the elements in it. Now create one function
     *     which will reverse the digits of the array, and keep adding the new numbers in the array. Now copy all the
     *     new array elements into a Set so that we can have only distinct elements and return the Set size.
     * <p>
     * Time Complexity : O(n)
     * </p>
     */


    public static void main(String[] args) {
        System.out.println(countDistinctIntegers(new int[]{1, 13, 10, 12, 31}));
    }

    public static int countDistinctIntegers(int[] nums) {

        int[] newNums = new int[nums.length * 2];

        for (int i = 0; i < newNums.length; i++) {
            if (i < nums.length) {
                newNums[i] = nums[i];
            } else {
                newNums[i] = reverseDigits(nums[i - nums.length]);
            }
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int num : newNums) {
            resultSet.add(num);
        }

        return resultSet.size();
    }

    private static int reverseDigits(int num) {
        StringBuilder strNums = new StringBuilder();
        strNums.append(num);
        strNums.reverse();
        return Integer.parseInt(strNums.toString());
    }
}
