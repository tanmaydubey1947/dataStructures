package archive.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {


    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/subsets/">...</a>
     * <p>
     * Iteration for better approach : 1
     * <p>
     *    First get the number of subsets will be there, so it will be 2^n -1. Now collect all the binaries till 2^n-1 and for every set bit we need to add in our result list.
     *    Now there is a catch in setting up the binaries, we need to append extra zeros in beginning of the binaries for those which have no leading zeros.
     *    After that iterate throughout the array list of binaries and keep pushing into the result list for every set bits.
     * <p>
     * Time Complexity : O(n^2)
     * </p>
     */

    public static void main(String[] args) {

        System.out.println(subsets(new int[]{1, 2, 3}));

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<String> setBits = calculateSetBits((int) Math.pow(2, nums.length));

        List<List<Integer>> finalResult = new ArrayList<>();

        for (String tempStr : setBits) {

            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < tempStr.length(); i++) {

                if (tempStr.charAt(i) == '1') {
                    result.add(nums[i]);
                }
            }

            finalResult.add(result);
        }

        return finalResult;

    }


    private static List<String> calculateSetBits(int num) {

        List<String> setBits = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            if (Integer.toBinaryString(i).length() == Integer.toBinaryString(num - 1).length()) {
                setBits.add(Integer.toBinaryString(i));
            } else {

                int temp = Integer.toBinaryString(num - 1).length() - Integer.toBinaryString(i).length();
                StringBuilder customSetBit = new StringBuilder();

                while (temp != 0) {
                    customSetBit.append("0");
                    temp--;
                }

                customSetBit.append(Integer.toBinaryString(i));

                setBits.add(customSetBit.toString());

            }

        }

        return setBits;
    }
}
